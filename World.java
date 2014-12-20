import java.util.ArrayList;
import java.util.List;

public class World extends Thread {
  public int width;
  public int height;
  public Cell[][] board;
  public ArrayList<Robot> robots;

  public World(){};

  public World(int x, int y) {
    if(hasCorrectSize(x, y)) {
      width = x;
      height = y;
      robots = new ArrayList<Robot>();
      board = fill(new Cell[height][width]);
    } else {
      System.out.println("La taille du tableau depasse la taille limite (20,30)");
    }
  }

  public static boolean hasCorrectSize(int width, int height) {
    return width <= 30 && height <= 20;
  }

  public boolean isFree(int x, int y) {
    return board[x][y].isFree();
  }

  public boolean isValidCell(int x, int y) {
    return x < height && x >= 0 && y <= width+1 && y >= 0;
  }

  public Cell[][] fill(Cell[][] board) {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        board[i][j] = new Cell();
      }
    }
    return board;
  }

  public void use(int x, int y, Robot robot) {
    board[x][y].addRobot(robot);
  }

  public static void main(String[] args) {
    String speed = args.length == 0 ? "100" : args[0];

    World world = new World(7,4);

    RobotPolluter robotPolluter = new RobotPolluter(1, 0, 0,  world);
    PolluterJumper polluterJumper = new PolluterJumper(2, 0, world.width-1, world);
    RobotCleaner robotCleaner = new RobotCleaner(3, world.height-1, 0, world);
    CleanerDistract cleanerDistract = new CleanerDistract(4, world.height-1, world.width-1, world);

    world.robots.add(robotPolluter);
    world.robots.add(polluterJumper);
    world.robots.add(robotCleaner);
    world.robots.add(cleanerDistract);

    View view = new View(world);
    Controller ctrl = new Controller(world, view);

    Timer timer = new Timer(ctrl);
    timer.start(Integer.parseInt(speed));
  }
}
