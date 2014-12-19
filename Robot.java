public abstract class Robot {
  public int id;
  public int x;
  public int y;
  public World world;

  public Robot(){};

  public Robot(int num, int coordX, int coordY, World w) {
    id = num;
    x = coordX;
    y = coordY;
    world = w;
  }

  public void move() {
    System.out.println(Integer.toString(id) + " is moving !");
  }
}
