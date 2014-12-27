package org.robots.models;

public class Hulk extends RobotCleaner {
  public boolean canClean = true;

  public Hulk() {}

  public Hulk(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void move() {
    int xn = getX()-1;
    int yn = getY();
    if(xn == -1) {
      moveIfFree(getWorld().getWidth()-1, yn+1);
    } else {
      if(yn == getWorld().getHeight()) {
        moveIfFree(xn, 0);
      } else {
        moveIfFree(xn, yn);
      }
    }
  }

  public void polluteOrClean() {
    if(getWorld().getBoard()[getY()][getX()].isPolluted()) {
      if(canClean) {
        clean();
        canClean = false;
      } else {
        canClean = true;
      }
    }
  }
}
