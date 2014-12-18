import java.util.ArrayList;
import java.util.List;

public class World extends Thread {
  public int width;
  public int height;
  public Cell[][] board;
  public List<Robot> robots;

  public World(int width, int height) {
    if(hasCorrectSize(width, height)) {
      this.width = width;
      this.height = height;
      this.robots = new ArrayList<Robot>();
      this.board = fill(new Cell[height][width]);
    } else {
      System.out.println("La taille du tableau depasse la taille limite (20,30)");
    }
  }

  public static boolean hasCorrectSize(int width, int height) {
    return width <= 30 && height <= 20;
  }

  public Cell[][] fill(Cell[][] board) {
    for (int i = 0; i < this.height; i++) {
      for (int j = 0; j < this.width; j++) {
        board[i][j] = new Cell();
      }
    }
    return board;
  }

  public void setPosition(int x, int y, Robot robot) {
    for (int i = 0; i < this.height; i++) {
      for (int j = 0; j < this.width; j++) {
        if(board[i][j].show == robot.id) {
          board[i][j].show = 0;
        }
      }
    }
    this.board[x][y].addRobot(robot);
  }

  public void enable(int sleepTime) {
    for(Robot r : this.robots) {
      r.roam(sleepTime);
    }
  }

  public static void main(String[] args) {
    World world = new World(7,4);

    RobotPolluter robotPolluter = new RobotPolluter(1, 0, 0,  world);
    robotPolluter.start();

    PolluterJumper polluterJumper = new PolluterJumper(2, 0, world.width-1, world);
    polluterJumper.start();

    RobotCleaner robotCleaner = new RobotCleaner(3, world.height-1, 0, world);
    robotCleaner.start();

    CleanerDistract cleanerDistract = new CleanerDistract(4, world.height-1, world.width-1, world);
    cleanerDistract.start();

    Screen screen = new Screen(world);
    screen.start();

    world.robots.add(robotPolluter);
    world.robots.add(polluterJumper);
    world.robots.add(robotCleaner);
    world.robots.add(cleanerDistract);
    world.enable(Integer.parseInt(args[0]));

    System.out.println("plop");
  }
}
