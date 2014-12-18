public abstract class Robot {
  public int id;
  public int x;
  public int y;
  public World world;

  public Robot(int id, int x, int y, World world) {
    this.id = id;
    this.x = x;
    this.y = y;
    this.world = world;
  }

  public void sleep(int speed) {
    try {
      Thread.sleep(speed);
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

  public void roam(int speed) {}


}
