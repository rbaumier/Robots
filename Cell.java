public class Cell {
  public int x;
  public int y;
  public String state;
  public String show;
  public Robot robot;

  public Cell() {
    state = "free";
    show = "0";
    robot = null;
  }

  public boolean isFree() {
    return state == "free";
  }

  public void pollute() {
    show = "9";
    state = "polluted";
  }

  public void clean() {
    state = "free";
    show = "0";
  }

  public boolean isPolluted() {
    return state == "polluted";
  }

  public void addRobot(Robot robot) {
    robot = robot;
    show = Integer.toString(robot.id);
  }
}
