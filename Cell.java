public class Cell {
  public int state; // 0:clean, 1:polluted
  public Robot robot;

  public Cell() {
    state = 0;
    robot = null;
  }

  public void use(Robot robot) { this.robot = robot; }

  public void release() { this.robot = null; }
  public boolean isFree() { return this.robot == null; }

  public void pollute() { this.state = 1; }
  public boolean isPolluted() { return this.state == 1; }

  public void clean() { this.state = 0; }
  public boolean isClean() { return this.state == 0; }
}
