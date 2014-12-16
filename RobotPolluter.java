public class RobotPolluter extends Robot {
  private int startCol;

  public RobotPolluter(int num, int x, int y, World world, int startCol) {
    super(num, x, y, world);
    startCol = startCol; // WTF ? diff between x and startCol ??
  }

  public void pollutes() {
    world.board[x][y] = -1;
  }

  public void roam() {
    //TODO : go straight and pollutes every case
    //startPoint in (0, startCol)
  }
}
