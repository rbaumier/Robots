package org.robots.models;

public class Loki extends RobotPolluter {
  public int startCol;

  public Loki(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void move() {
    setX(getX() + 1);
    if(getX() == getWorld().width) {
      setX(0);
      setY(getY() + 1);
    }
    if(getY() == getWorld().height) {
      setY(0);
    }
    use();
    pollute();
  }
}
