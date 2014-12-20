public class View {
  public World world;

  public View(){}

  public View(World w) {
    world = w;
  }

  public String repeat(String toRepeat, int times) {
    String str = "";
    for (int i = 0; i < times; i++) {
      str += toRepeat;
    }
    return str;
  }

  public String getCellState(Cell cell) {
    if(!cell.isFree()) {
      return Integer.toString(cell.robot.id);
    }

    if(cell.isClean()) {
      return ".";
    }

    return "X";
  }

  public void refresh() {
    System.out.println(repeat("---", world.width) + "-");
    for (int i = 0; i < world.height; i++) {
      System.out.print("|");
      for (int j = 0; j < world.width; j++) {
        System.out.print(" " + getCellState(world.board[i][j]) + " ");
      }
      System.out.print("|");
      System.out.println("");
    }
    System.out.println(repeat("---", world.width) + "-");
  }
}
