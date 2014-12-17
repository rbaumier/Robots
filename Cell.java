public class Cell {
  public Cell(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public boolean isFree(int x, int y) {
    return board[x][y] <= 0;
  }

  public void use(int x, int y, int id) {
    board[x][y] = id;
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
