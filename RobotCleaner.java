public class RobotCleaner extends Robot {

  public RobotCleaner(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void clean() {
    world.board[x][y].clean();
  }

  //boustrophedon
  public void roam(Cell[][] board) {
    // from top
    for (int i = 0; i < board.length; i++) {
      if (i%2 == 0) {
        for (int j = 0; j < board.length; j++) {
          // System.out.println(board[i][j].show());
        }
      } else {
        for (int k = board.length-1; k >= 0; k--) {
          // System.out.println(board[i][k].show());
        }
      }
    }

    // from bottom
    for (int i = board.length-1; i >= 0; i--) {
      if (i%2 != 0) {
        for (int j = 0; j < board.length; j++) {
          // System.out.println(board[i][j].show());
        }
      } else {
        for (int k = board.length-1; k >= 0; k--) {
          // System.out.println(board[i][k].show());
        }
      }
    }
  }
}
