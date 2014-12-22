import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class RobotPanel extends JPanel {
  public World world;

  public RobotPanel(World w) {
    world = w;
  }

  @Override
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    drawRobots(g);
  }

  public void drawRobots(Graphics g) {
    for (int i = 0; i < world.height; i++) {
      for (int j = 0; j < world.width; j++) {

        if(!world.board[i][j].isFree()) {
          Robot robot = world.board[i][j].robot;
          try {
            Image img = ImageIO.read(new File("img/clean.png"));
            g.drawImage(img, robot.x*100, robot.y*100, this);
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }
}
