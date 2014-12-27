package org.robots.models;

public class Loki extends RobotPolluter {
  public int startCol;

  public Loki() {}

  public Loki(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void move() {
    int xn = (int) Math.abs(Math.random() * getWorld().getWidth());
    int yn = (int) Math.abs(Math.random() * getWorld().getHeight());
    moveIfFree(xn, yn);
  }
}

