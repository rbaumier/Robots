package org.robots.models;

public class RobotPolluter extends Robot {
  public RobotPolluter(int num, int x, int y, World world){
    super(num, x, y, world);
  }

  public void pollute() {
    getWorld().getBoard()[getY()][getX()].pollute();
  }
}
