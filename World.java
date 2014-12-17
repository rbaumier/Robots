public class World {
  private int width;
  private int height;
  private int[][] board;

  public World(int width, int height) {
    if(hasCorrectSize(width, height)) {
      this.width = width;
      this.height = height;
      board = setDefaultValues(new int[height][width]);
    } else {
      System.out.println("La taille du tableau depasse la taille limite (20,30)");
    }
  }

  public static boolean hasCorrectSize(int width, int height) {
    System.out.println("width:" + width + " height: " + height);
    return width <= 30 && height <= 20;
  }

  public int[][] setDefaultValues(int[][] board) {
    for (int i = 0; i < this.height; i++) {
      for (int j = 0; j < this.width; j++) {
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
    for (int i = 0; i < this.height; i++) {
      System.out.print("|");
      for (int j = 0; j < this.width; j++) {
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
    World board = new World(25,15);
    board.show();
  }
}
