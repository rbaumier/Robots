public abstract class Robot {
  public int id;
  public int x;
  public int y;
  public World world;

  public Robot() {
    this.x = 0;
    this.y = 0;
  }

  public Robot(int id, int x, int y) {
    this.id = id;
    this.x = x;
    this.y = y;
  }

  // public void move(int x, int y) {
  //   if(world.board[x,y].isAvailable()) {
  //     x = x;
  //     y = y;
  //   }
  // }

  public void roam() {}
}
