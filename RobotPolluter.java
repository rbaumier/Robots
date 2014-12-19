public class RobotPolluter extends Robot {
  public int startCol;

  public RobotPolluter(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void pollute() {
    world.board[x][y].pollute();
  }

  public void move() {}
}
