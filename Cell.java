public class Cell {
  public int x;
  public int y;
  public String state;
  public Robot robot;

  public Cell() {
    state = "free";
    robot = null;
  }

  public void free() { state = "free"; }
  public boolean isFree() { return state == "free"; }

  public void pollute() { state = "polluted"; }
  public boolean isPolluted() { return state == "polluted"; }

  public void clean() { state = "free"; }
  public void use(Robot robot) { robot = robot; }
}
