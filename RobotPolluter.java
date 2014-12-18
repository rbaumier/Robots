public class RobotPolluter extends Robot {
  public int startCol;

  public RobotPolluter(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void pollutes() {
    world.board[x][y].clean();
  }

  public void roam(int speed) {
    for (int i = this.world.height-1; i >= 0; i--) {
      for (int j = 0; j < this.world.width; j++) {
        this.world.setPosition(i,j,this);
        sleep(speed);
      }
    }
    roam(speed);
  }
}
