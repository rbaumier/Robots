package org.robots.models;

public abstract class RobotPolluter extends Robot {

  public RobotPolluter(){}

  public RobotPolluter(int num, int x, int y, World world){
    super(num, x, y, world);
  }

  public void pollute() {
    getWorld().getBoard()[getY()][getX()].pollute();
  }

  public void polluteOrClean() {
    pollute();
  }
}
