public abstract class Robot {
  public int id;
  public int x;
  public int y;
  public World world;

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

  public void goTo(int x, int y) {
    if(world.isFree(x, y)) {
      x = x;
      y = y;
    }
  }

  public void roam() {}
}
