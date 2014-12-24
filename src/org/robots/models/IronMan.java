package org.robots.models;

public class IronMan extends RobotCleaner {
  public IronMan(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void move() {
    if((getX() == getWorld().width-1) && ((getY() == 0 && getWorld().width%2 == 0) || (getWorld().width % 2 != 0 && getY() == getWorld().height-1))) {
      if(getWorld().width % 2 == 0 && getY() == 0) {
        setX(0);
        setY(0);
      } else {
        if (getWorld().width % 2 != 0 && getY() == getWorld().height-1) {
          setX(0);
          setY(0);
        }
      }
    } else {
      if(getX()%2 == 0) {
        if(getY() == getWorld().height-1) {
          if(getX()%2 == 0) {
            setX(getX() + 1);
          } else {
            setY(getY() - 1);
          }
        } else {
          setY(getY() + 1);
        }
      } else {
        if(getY() == 0) {
          setX(getX() + 1);
        } else {
          setY(getY()-1);
        }
      }
    }
    use();
    clean();
  }
}
