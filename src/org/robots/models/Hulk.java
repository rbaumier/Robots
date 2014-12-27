package org.robots.models;

public class Hulk extends RobotCleaner {
  public boolean canClean = true;

  public Hulk() {}

  public Hulk(int num, int x, int y, World world) {
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
