public abstract class Robot {
  public int id;
  public int x;
  public int y;
  public World world;

  public Robot(){};

  public Robot(int num, int coordY, int coordX, World w) {
    id = num;
    x = coordX;
    y = coordY;
    world = w;
  }

  public void move() {
    y += 1;
    if(y == world.width) {
      y = 0;
      x += 1;
    }
    if(x == world.height) {
      x = 0;
    }
    world.board[x][y].use(this);
  }

  public void release() {
    world.board[x][y].release();
  }
}
