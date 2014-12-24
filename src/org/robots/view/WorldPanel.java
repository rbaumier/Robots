package org.robots.view;

import org.robots.models.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.BasicStroke;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class WorldPanel extends JPanel {
  private World world;

  public WorldPanel() {}

  public WorldPanel(World w) {
    world = w;
    this.setBackground(new Color(0xECF0F1));
  }

  @Override
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(new Color(0x2C3E50));

    Graphics2D g2 = (Graphics2D) g;
    g2.setStroke(new BasicStroke(2));

    int offsetX = this.getWidth()/this.world.getWidth();
    int offsetY = this.getHeight()/this.world.getHeight();
    drawBoard(g, offsetX, offsetY);
    drawRobotsAndBombs(g, offsetX, offsetY);
  }

  public void drawBoard(Graphics g, int offsetX, int offsetY){
    for(int x=0; x < this.getWidth(); x+=offsetX) {
      g.drawLine(x, this.getHeight(), x, 0);
    }

    for(int y=0; y < this.getHeight(); y+=offsetY) {
      g.drawLine(0, y, this.getWidth(), y);
    }
  }

  public void drawRobotsAndBombs(Graphics g, int offsetX, int offsetY) {
    int imgWidth = getImgDim(offsetX);
    int imgHeight = getImgDim(offsetY);
    for (int i = 0; i < getWorld().getHeight(); i++) {
      for (int j = 0; j < getWorld().getWidth(); j++) {
        if(!getWorld().getBoard()[i][j].isFree()) {
          int id = getWorld().getBoard()[i][j].robot.getId();
          try {
            Image rb = ImageIO.read(getClass().getResource("img/" + id + ".png"));
            g.drawImage(rb, j*offsetX+offsetX/8, i*offsetY+offsetY/8, imgWidth, imgHeight, this);
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
        else if(getWorld().getBoard()[i][j].isPolluted()) {
         try {
            Image bomb = ImageIO.read(getClass().getResource("img/bomb.png"));
            g.drawImage(bomb, j*offsetX+offsetX/8, i*offsetY+offsetY/8, imgWidth, imgHeight, this);
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }

  public World getWorld() { return world; }
  public void setWorld(World w) { world = w; }

  public int getImgDim(int offset) {
    return offset-offset/4;
  }
}
