public abstract class Robot extends Thread{
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

  public void move() {}
}
