public class World {
  private int length;
  private int widht;
  private int[][] board;

  public World(int length, int widht) {
    board = setDefaultValues(new int[length][width]);
  }

  public int[][] setDefaultValues(int[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        board[i][j] = 0;
      }
    }
    return board;
  }

  public boolean isFree(int x, int y) {
    return board[x][y] == -1;
  }

  public void setFree(int x, int y) {
    board[x][y] = 0;
  }

  public void use(int x, int y, int id) {
    board[x][y] = id;
  }

  public String toString() {
    //case X : dirty, "." clean
  }

  public void pollutes(int x, int y) {
    board[x][y] = -1;
  }

  public void clean(int x, int y) {
    board[x][y] = 0;
  }

  public boolean isDirty(int x, int y) {
    return board[x][y] == -1;
  }
}
