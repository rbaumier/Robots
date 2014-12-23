package org.robots.models;

public class RobotCleaner extends Robot {
  public RobotCleaner(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void clean() {
    world.board[y][x].clean();
  }

  public void move() {
    x += 1;
    if(x == world.width) {
      x = 0;
      y += 1;
    }
    if(y == world.height) {
      y = 0;
    }
    use();
    clean();
  }
}
