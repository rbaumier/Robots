import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class BoardPanel extends JPanel {
  public World world;

  @Override
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    drawBoard(g);
  }

  public void drawBoard(Graphics g){
    int width = this.getWidth();
    int height = this.getHeight();

    for(int x=0; x < width; x+=width/10) {
      g.drawLine(x, height, x, 0);
    }

    for(int y=0; y < height; y+=height/10) {
      g.drawLine(0, y, width, y);
    }
  }
}
