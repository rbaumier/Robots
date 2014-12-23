package org.robots.view;

import org.robots.models.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Color;
import java.awt.BasicStroke;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class WorldPanel extends JPanel {
  public World world;

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

    int offsetX = this.getWidth()/world.width;
    int offsetY = this.getHeight()/world.height;
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
    for (int i = 0; i < world.height; i++) {
      for (int j = 0; j < world.width; j++) {
        if(!world.board[i][j].isFree()) {
          int id = world.board[i][j].robot.id;
          try {
            Image rb = ImageIO.read(getClass().getResource("img/" + id + ".png"));
            g.drawImage(rb, j*offsetX+offsetX/8, i*offsetY+offsetY/8, imgWidth, imgHeight, this);
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
        else if(world.board[i][j].isPolluted()) {
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

  public int getImgDim(int offset) {
    return offset-offset/4;
  }
}
