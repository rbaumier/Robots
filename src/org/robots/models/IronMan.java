package org.robots.models;

public class IronMan extends RobotCleaner {
  public IronMan() {}

  public IronMan(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void move() {
    if((getX() == getWorld().getWidth()-1) && ((getY() == 0 && getWorld().getWidth()%2 == 0) || (getWorld().getWidth() % 2 != 0 && getY() == getWorld().getHeight()-1))) {
      if(getWorld().getWidth() % 2 == 0 && getY() == 0) {
        moveIfFree(0,0);
      } else {
        if (getWorld().getWidth() % 2 != 0 && getY() == getWorld().getHeight()-1) {
          moveIfFree(0,0);
        }
      }
    } else {
      if(getX()%2 == 0) {
        if(getY() == getWorld().getHeight()-1) {
          if(getX()%2 == 0) {
            moveIfFree(getX() + 1, getY());
          } else {
            moveIfFree(getX(), getY() - 1);
          }
        } else {
          moveIfFree(getX(), getY() + 1);
        }
      } else {
        if(getY() == 0) {
          moveIfFree(getX() + 1, getY());
        } else {
          moveIfFree(getX(), getY()-1);
        }
      }
    }
    use();
    clean();
  }
}
