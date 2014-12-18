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

  // public void roam(int x, int y) {
  //   if(world.board[x,y].isAvailable()) {
  //     x = x;
  //     y = y;
  //   }
  // }

  public void roam() {}
}
