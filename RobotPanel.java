import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class RobotPanel extends JPanel {
  public World world;

  @Override
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    drawRobots(g);
  }

  public void drawRobots(Graphics g) {
    try {
      Image img = ImageIO.read(new File("img/clean.png"));
      g.drawImage(img, 0, 0, this);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
