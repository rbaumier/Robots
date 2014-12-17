public class Cell {
  public int x;
  public int y;
  public int state;

  public Cell(int x, int y) {
    this.x = x;
    this.y = y;
    this.state = 0;
  }

  public boolean isAvailable() {
    return this.state == 0;
  }

  public void use(int x, int y, int id) {
    this.state = id;
  }

  public void pollute(int x, int y) {
    this.state = -1;
  }

  public void clean(int x, int y) {
    this.state = 0;
  }

  public boolean isPolluted(int x, int y) {
    return this.state == -1;
  }

  public String toString() {
    return Integer.toString(this.state);
  }
}
