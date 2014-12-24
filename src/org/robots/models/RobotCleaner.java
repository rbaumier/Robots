package org.robots.models;

public class RobotCleaner extends Robot {
  public RobotCleaner(int num, int x, int y, World world){
    super(num, x, y, world);
  }

  public void clean() {
    getWorld().getBoard()[getY()][getX()].clean();
  }
}
