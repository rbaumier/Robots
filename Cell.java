public class Cell {
  public int x;
  public int y;
  public int state; // 0:clean, 1:polluted
  public Robot robot;

  public Cell() {
    state = 0;
    robot = null;
  }

  public void use(Robot robot) { robot = robot; }
  public void free() { robot = null; }
  public boolean isFree() { return robot == null; }

  public void pollute() { state = 1; }
  public boolean isPolluted() { return state == 1; }

  public void clean() { state = 0; }
  public boolean isClean() { return state == 0; }
}
