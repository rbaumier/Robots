public class PolluterJumper extends RobotPolluter {
  public int deltaX;
  public PolluterJumper() {}

  public PolluterJumper(int num, int x, int y, World world, int deltaX) {
    super(num, x, y, world);
    deltaX = deltaX;
  }

  public void roam() {
    //TODO : question 11
  }

}
