public abstract class Robot extends Thread{
  public int id;
  public int x;
  public int y;
  public World world;

  public Robot(int num, int coordX, int coordY, World w) {
    id = num;
    x = coordX;
    y = coordY;
    world = w;
  }

  public void move() {}
}
