public class Cell {
  public int x;
  public int y;
  public String state;
  public int show;

  public Cell() {
    this.state = "free";
    this.show = 0;
  }

  public boolean isAvailable() {
    return this.state == "free";
  }

  public void use(int id) {
    this.show = id;
    this.state = "busy";
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
}
