public class RobotPolluter extends Robot {
  public int startCol;

  public RobotPolluter(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void pollute() {
    world.board[y][x].pollute();
  }

  public void move() {
    x += 1;
    if(x == world.width) {
      x = 0;
      y += 1;
    }
    if(y == world.height) {
      y = 0;
    }
    use();
    pollute();
  }
}
