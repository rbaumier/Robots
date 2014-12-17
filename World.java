public class World {
  private int widht;
  private int length;
  private int[][] board;

  public World(int length, int widht) {
    board = setDefaultValues(new int[width][length]);
  }

  public int[][] setDefaultValues(int[][] board) {
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < length; j++) {
        board[i][j] = 0;
      }
    }
    return board;
  }

  public boolean isFree(int x, int y) {
    return board[x][y] <= 0;
  }

  public void use(int x, int y, int id) {
    board[x][y] = id;
  }

  public String toString() {
    //case X : dirty, "." clean
  }

  public void pollute(int x, int y) {
    board[x][y] = -1;
  }

  public void clean(int x, int y) {
    board[x][y] = 0;
  }

  public boolean isDirty(int x, int y) {
    return board[x][y] == -1;
  }
}
