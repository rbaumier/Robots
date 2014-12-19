public class Cell {
  public int x;
  public int y;
  public String state;
  public int show;
  public Robot robot;

  public Cell(){};

  public Cell() {
    state = "free";
    show = 0;
    robot = null;
  }

  public boolean isAvailable() {
    return state == "free";
  }

  public void pollute() {
    show = 5;
    state = "polluted";
  }

  public void clean() {
    state = "free";
    show = 0;
  }

  public boolean isPolluted() {
    return state == "polluted";
  }

  public String toString() {
    return Integer.toString(show);
  }

  public void addRobot(Robot robot) {
    robot = robot;
    show = robot.id;
  }
}
