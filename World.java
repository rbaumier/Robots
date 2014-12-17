public class World {
  private int width;
  private int height;
  private int[][] board;
  private List<Robot> robots = new ArrayList<Robot>();

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
    return width <= 30 && height <= 20;
  }

  public int[][] setDefaultValues(int[][] board) {
    for (int i = 0; i < this.height; i++) {
      for (int j = 0; j < this.width; j++) {
        board[i][j] = new Cell(i,j);
      }
    }
    return board;
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

  public static void main(String[] args) {
    World board = new World(25,15);
    board.show();
  }
}
