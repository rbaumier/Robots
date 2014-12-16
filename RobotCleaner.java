public class RobotCleaner extends Robot {

  public RobotCleaner(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void clean() {
    world.board[x][y] = 0;
  }

  public void roam() {
    //TODO : boustrophédon mode with start at (0,0) and clean every case
  }
}
