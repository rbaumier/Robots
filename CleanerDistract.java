public class CleanerDistract extends RobotCleaner {

  public CleanerDistract(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void roam(int speed) {
    roamFromBottom(speed);
    roamFromTop(speed);
    roam(speed);
  }
}
