public class PolluterStraight extends RobotPolluter {
  public int startCol;
  public PolluterStraight() {}

  public PolluterStraight(int num, int x, int y, World world, int startCol) {
    super(num, x, y, world);
    startCol = startCol; // WTF ? diff between x and startCol ??
  }

  public void roam() {
    //TODO : go straight and pollutes every case
    //startPoint in (0, startCol)
  }
}
