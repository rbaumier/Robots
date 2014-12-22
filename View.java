import javax.swing.JFrame;

public class View extends JFrame {
  public World world;

  public View(World w) {
    this.setSize(w.width*100, w.height*100);
    this.setTitle("Sarah Connor ?");
    this.setDefaultCloseOperation(View.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    this.setContentPane(new BoardPanel());
    // this.setContentPane(new RobotPanel(w));

    this.setVisible(true);
  }


  // public String repeat(String toRepeat, int times) {
  //   String str = "";
  //   for (int i = 0; i < times; i++) {
  //     str += toRepeat;
  //   }
  //   return str;
  // }

  // public String getCellState(Cell cell) {
  //   if(!cell.isFree()) {
  //     return Integer.toString(cell.robot.id);
  //   }

  //   if(cell.isClean()) {
  //     return ".";
  //   }

  //   return "X";
  // }

  // public void refresh() {
  //   System.out.println(repeat("---", world.width) + "-");
  //   for (int i = 0; i < world.height; i++) {
  //     System.out.print("|");
  //     for (int j = 0; j < world.width; j++) {
  //       System.out.print(" " + getCellState(world.board[i][j]) + " ");
  //     }
  //     System.out.print("|");
  //     System.out.println("");
  //   }
  //   System.out.println(repeat("---", world.width) + "-");
  // }
}
