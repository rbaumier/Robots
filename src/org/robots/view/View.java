package org.robots.view;

import org.robots.models.*;

import javax.swing.JFrame;

public class View extends JFrame {
  public View(World w) {
    this.setSize(w.getWidth()*100, w.getHeight()*100);
    this.setTitle("Avengers - The movie");
    this.setDefaultCloseOperation(View.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    this.setContentPane(new WorldPanel(w));

    this.setVisible(true);
  }
}
