import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JPanelDessin extends JPanel {
  public World world;

  @Override
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    //x1, y1, x2, y2

    drawBoard(g);
  }

  public void drawBoard(Graphics g){
    int width = this.getWidth();
    for(int x=0; x < width; x+=100) {
      for(int y=0; y < width; y+=100) {
        g.drawLine(x, this.getHeight(), x, 0);
        g.drawLine(0, y, this.getWidth(), y);
      }
    }
  }
}
