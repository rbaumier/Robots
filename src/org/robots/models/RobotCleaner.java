package org.robots.models;

public class RobotCleaner extends Robot {
  public RobotCleaner(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void clean() {
    world.board[y][x].clean();
  }

  public void move() {
    moveFromRight();
    use();
    clean();
  }

  public void moveFromRight() {

  }
}
