public class RobotPolluter extends Robot {
  public int startCol;

  public RobotPolluter(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void pollutes() {
    world.board[x][y].clean();
  }

  public void roam() {
    //TODO : go straight and pollutes every case
    //startPoint in (0, startCol)
  }
}
