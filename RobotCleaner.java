public class RobotCleaner extends Robot {

  public RobotCleaner(int num, int x, int y) {
    super(num, x, y);
  }

  public void clean() {
    world.board[x][y].clean();
  }

  public void roam(Cell[][] board) {
    //boustrophedonFromTop(board);
    //boustrophedonFromBottom(board);
  }

  public void boustrophedonFromTop(Cell[][] board) {
    for (var i = 0; i < board.length; i++) {
      if (i%2 == 0) {
        for (var j = 0; j < board.length; j++) {
          // System.out.println(board[i][j].show());
        }
      } else {
        for (var k = board.length-1; k >= 0; k--) {
          // System.out.println(board[i][k].show());
        }
      }
    }
  }

  public void boustrophedonFromBottom(Cell[][] board) {
    for (var i = board.length-1; i >= 0; i--) {
      if (i%2 !== 0) {
        for (var j = 0; j < board.length; j++) {
          // System.out.println(board[i][j].show());
        }
      } else {
        for (var k = board.length-1; k >= 0; k--) {
          // System.out.println(board[i][k].show());
        }
      }
    }
  }
}
