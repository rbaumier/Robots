public class Screen extends Thread {
  public World world;

  public Screen(){}

  public Screen(World w) {
    world = w;
  }

  public void run() {
    show(500);
  }

  public String repeat(String toRepeat, int times) {
    String str = "";
    for (int i = 0; i < times; i++) {
      str += toRepeat;
    }
    return str;
  }

  public void show(int sleepTime) {
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

    try {
      Thread.sleep(sleepTime);
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
    show(sleepTime);
  }
}
