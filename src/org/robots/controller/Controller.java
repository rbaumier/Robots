package org.robots.controller;

import org.robots.models.*;
import org.robots.view.*;

public class Controller {
  public World world;
  public View view;

  public Controller() {}

  public Controller(World w, View v) {
    world = w;
    view = v;
  }

  public void update() {
    for(Robot r : getWorld().getRobots()) {
      r.release();
      r.move();
    }
    view.repaint();
  }

  public World getWorld() { return world; }
  public View getView() { return view; }
}
