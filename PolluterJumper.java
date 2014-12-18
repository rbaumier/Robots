public class PolluterJumper extends RobotPolluter {
  private int deltaX;

  public PolluterJumper(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void roam(int sleepTime) {

    //TODO : question 11. = cavaliers echecs
    for (int i = 0; i < this.world.height; i++) {
      for (int j = 0; j < this.world.width; j++) {
        this.world.setPosition(i,j,this);
        sleep(sleepTime);
      }
    }
    roam(sleepTime);
  }
}
