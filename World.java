import java.util.ArrayList;
import java.util.List;

public class World {
  public int width;
  public int height;
  public Cell[][] board;
  public List<Robot> robots;

  public World(int width, int height) {
    if(hasCorrectSize(width, height)) {
      this.width = width;
      this.height = height;
      this.robots = new ArrayList<Robot>();
      board = fill(new Cell[height][width]);
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

  public String repeat(String toRepeat, int times) {
    String str = "";
    for (int i = 0; i < times; i++) {
      str += toRepeat;
    }
    return str;
  }

  public void show() {
    System.out.println(repeat("---", this.width) + "-");
    for (int i = 0; i < this.height; i++) {
      System.out.print("|");
      for (int j = 0; j < this.width; j++) {
        System.out.print(" " + board[i][j].toString() + " ");
      }
      System.out.print("|");
      System.out.println("");
    }
    System.out.println(repeat("---", this.width) + "-");
  }

  public static void main(String[] args) {
    World world = new World(25,15);

    RobotPolluter robotPolluter = new RobotPolluter(1, 0, 0,  world);
    PolluterJumper polluterJumper = new PolluterJumper(2, 0, world.width-1, world);
    RobotCleaner robotCleaner = new RobotCleaner(3, world.height-1, 0, world);
    CleanerDistract cleanerDistract = new CleanerDistract(4, world.height-1, world.width-1, world);

    world.robots.add(robotPolluter);
    world.robots.add(polluterJumper);
    world.robots.add(robotCleaner);
    world.robots.add(cleanerDistract);

    world.show();
  }
}
