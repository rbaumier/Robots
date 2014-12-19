public class View {
  public World world;

  public View(){}

  public View(World w) {
    world = w;
  }

  // public void run() {
  //   show(500);
  // }

  public String repeat(String toRepeat, int times) {
    String str = "";
    for (int i = 0; i < times; i++) {
      str += toRepeat;
    }
    return str;
  }

  public void refresh() {
    System.out.println(repeat("---", world.width) + "-");
    for (int i = 0; i < world.height; i++) {
      System.out.print("|");
      for (int j = 0; j < world.width; j++) {
        System.out.print(" " + world.board[i][j].toString() + " ");
      }
      System.out.print("|");
      System.out.println("");
    }
    System.out.println(repeat("---", world.width) + "-");
  }
}
