public class RobotPolluter extends Robot {
  public int startCol;

  public RobotPolluter(int num, int x, int y) {
    super(num, x, y);
  }

  public void pollutes() {
    world.board[x][y].clean();
  }

  public void roam() {
    //TODO : go straight and pollutes every case
    //startPoint in (0, startCol)
  }
}
