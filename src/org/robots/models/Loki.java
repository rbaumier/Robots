package org.robots.models;

public class Loki extends RobotPolluter {
  public int startCol;

  public Loki() {}

  public Loki(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void move() {
    setX(getX() + 1);
    if(getX() == getWorld().getWidth()) {
      setX(0);
      setY(getY() + 1);
    }
    if(getY() == getWorld().getHeight()) {
      setY(0);
    }
    use();
    pollute();
  }
}
