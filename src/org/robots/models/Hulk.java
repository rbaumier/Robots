package org.robots.models;

public class Hulk extends RobotCleaner {
  public boolean canClean = true;

  public Hulk() {}

  public Hulk(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void move() {
    setX(getX() -1 );
    if(getX() == -1) {
      setX(getWorld().getWidth()-1);
      setY(getY() + 1);
    }
    if(getY() == getWorld().getHeight()) {
      setY(0);
    }
    use();
    cleanIfPossible();
  }

  public void cleanIfPossible() {
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
