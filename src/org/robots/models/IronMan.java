package org.robots.models;

public class IronMan extends RobotCleaner {
  public IronMan() {}

  public IronMan(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void move() {
    int height = getWorld().getHeight();
    int width = getWorld().getWidth();

    int xn = getX();
    int yn = getY();

    if((xn == width-1) && ((yn == 0 && width%2 == 0) || (width % 2 != 0 && yn == height-1))) {
      if(width % 2 == 0 && yn == 0) {
        xn = 0;
        yn = 0;
      } else {
        if (width % 2 != 0 && yn == height-1) {
          xn = 0;
          yn = 0;
        }
      }
    } else {
      if(xn%2 == 0) {
        if(yn == height-1) {
          if(xn%2 == 0) {
            xn += 1;
          } else {
            yn -= 1;
          }
        } else {
          yn += 1;
        }
      } else {
        if(yn == 0) {
          xn += 1;
        } else {
          yn -= 1;
        }
      }
    }
    moveIfFree(xn, yn);
  }
}
