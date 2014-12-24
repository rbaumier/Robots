package org.robots.models;

public class Hulk extends RobotCleaner {
  public boolean canClean = true;

  public Hulk(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void move() {
    setX(getX() -1 );
    if(getX() == -1) {
      setX(getWorld().width-1);
      setY(getY() + 1);
    }
    if(getY() == getWorld().height) {
      setY(0);
    }
    use();
    cleanIfPossible();
  }

  public void cleanIfPossible() {
    if(getWorld().board[getY()][getX()].isPolluted()) {
      if(canClean) {
        clean();
        canClean = false;
      } else {
        canClean = true;
      }
    }
  }
}
