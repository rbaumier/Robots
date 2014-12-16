public class PolluterJumper extends RobotPolluter {
  private int deltaX;

  public PolluterJumper(int num, int x, int y, World world, int deltaX) {
    super(num, x, y, world);
    deltaX = deltaX;
  }

  public void roam() {
    //TODO : question 11. = cavaliers échecs
  }
}
