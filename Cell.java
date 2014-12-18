public class Cell {
  public int x;
  public int y;
  public String state;
  public int show;
  public Robot robot;

  public Cell() {
    this.state = "free";
    this.show = 0;
    this.robot = null;
  }

  public boolean isAvailable() {
    return this.state == "free";
  }

  public void pollute() {
    this.show = -1;
    this.state = "polluted";
  }

  public void clean() {
    this.state = "free";
    this.show = 0;
  }

  public boolean isPolluted() {
    return this.state == "polluted";
  }

  public String toString() {
    return Integer.toString(this.show);
  }

  public void addRobot(Robot robot) {
    this.robot = robot;
    this.show = robot.id;
  }
}
