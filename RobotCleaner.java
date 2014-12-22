public class RobotCleaner extends Robot {
  public RobotCleaner(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void clean() {
    world.board[x][y].clean();
  }

}
