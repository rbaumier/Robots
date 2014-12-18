public class RobotPolluter extends Robot {
  public int startCol;

  public RobotPolluter(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void pollute() {
    world.board[x][y].pollute();
  }

  public void roam(int sleepTime) {
    for (int i = this.world.height-1; i >= 0; i--) {
      for (int j = 0; j < this.world.width; j++) {
        this.pollute();
        sleep(sleepTime);
        this.world.setPosition(i,j,this);
      }
    }
    roam(sleepTime);
  }
}
