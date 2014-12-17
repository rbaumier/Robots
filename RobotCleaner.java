public class RobotCleaner extends Robot {

  public RobotCleaner(int num, int x, int y) {
    super(num, x, y);
  }

  public void clean() {
    world.board[x][y].state = 0;
  }

  public void roam() {
    //TODO : boustrophedon mode with start at (0,0) and clean every case
  }
}
