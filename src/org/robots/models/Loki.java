package org.robots.models;

public class Loki extends RobotPolluter {
  public int startCol;

  public Loki() {}

  public Loki(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void move() {
    int xn = getX() + 1;
    if(xn == getWorld().getWidth()) {
      moveIfFree(0, getY() + 1);
    }
    if(getY() == getWorld().getHeight()) {
      moveIfFree(xn, 0);
    }
    moveIfFree(xn, getY());
  }
}
