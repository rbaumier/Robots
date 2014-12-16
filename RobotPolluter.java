public class RobotPolluter extends Robot {
  public RobotPolluter() {}

  public RobotPolluter(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void pollutes() {
    world.board[x][y] = 'X';
  }
}