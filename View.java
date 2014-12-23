import javax.swing.JFrame;

public class View extends JFrame {
  public World world;

  public View(World w) {
    this.setSize(w.width*100, w.height*100);
    this.setTitle("Avengers - The movie");
    this.setDefaultCloseOperation(View.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    this.setContentPane(new WorldPanel(w));

    this.setVisible(true);
  }
}
