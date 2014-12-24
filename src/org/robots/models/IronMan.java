package org.robots.models;

public class IronMan extends RobotCleaner {
  public IronMan() {}

  public IronMan(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void move() {
    if((getX() == getWorld().getWidth()-1) && ((getY() == 0 && getWorld().getWidth()%2 == 0) || (getWorld().getWidth() % 2 != 0 && getY() == getWorld().getHeight()-1))) {
      if(getWorld().getWidth() % 2 == 0 && getY() == 0) {
        setX(0);
        setY(0);
      } else {
        if (getWorld().getWidth() % 2 != 0 && getY() == getWorld().getHeight()-1) {
          setX(0);
          setY(0);
        }
      }
    } else {
      if(getX()%2 == 0) {
        if(getY() == getWorld().getHeight()-1) {
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
