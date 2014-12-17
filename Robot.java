public abstract class Robot {
  private int id;
  private int x;
  private int y;
  private World world;

  public Robot() {
    x = 0;
    y = 0;
    world = null;
  }

  public Robot(int id, int x, int y, World world) {
    id = id;
    x = x;
    y = y;
    world = world;
  }

  public void move(int x, int y) {
    if(world.isFree(x, y)) {
      x = x;
      y = y;
    }
  }

  public void roam() {}
}
