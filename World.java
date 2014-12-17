
public class World {
  private int width;
  private int length;
  private int[][] board;

  public World(int length, int width) {
    this.width = width;
    this.length = length;
    board = setDefaultValues(new int[width][length]);
  }

  public int[][] setDefaultValues(int[][] board) {
    for (int i = 0; i < this.width; i++) {
      for (int j = 0; j < this.length; j++) {
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

  public String repeat(String toRepeat, int times) {
    String str = "";
    for (int i = 0; i < times; i++) {
      str += toRepeat;
    }
    return str;
  }

  public void show() {
    System.out.println(repeat("---", this.width) + "-");
    for (int i = 0; i < this.width; ++i) {
      System.out.print("|");
      for (int j = 0; j < this.length; ++j) {
        System.out.print(" " + board[i][j] + " ");
      }
      System.out.print("|");
      System.out.println("");
    }
    System.out.println(repeat("---", this.width) + "-");
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

  public static void main(String[] args) {
    World board = new World(10,10);
    board.show();
  }
}
