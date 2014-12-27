package org.robots.models;

public class Loki extends RobotPolluter {
  public int startCol;

  public Loki() {}

  public Loki(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void move() {
    int xn = getX() + 1;
    int yn = getY();

    if(xn == getWorld().getWidth()) {
      xn = 0;
      yn = yn+1;
    }
    if(yn == getWorld().getHeight()) {
      yn = 0;
    }
    moveIfFree(xn, yn);
  }
}

