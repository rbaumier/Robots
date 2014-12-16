public class World {
  int length;
  int widht;
  int[][] board;

  public World(int length, int widht) {
    board = new int[length][width];
    setDefaultValues();
  }

  public void setDefaultValues() {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        board[i][j] = -1;
      }
    }
  }

  public boolean isFree(int x, int y) {
    return board[x][y] == -1;
  }

  public void setFree(int x, int y) {
    board[x][y] = -1;
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
