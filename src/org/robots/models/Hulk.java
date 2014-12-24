package org.robots.models;

public class Hulk extends RobotCleaner {
  public boolean canClean = true;

  public Hulk(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void move() {
    x -= 1;
    if(x == -1) {
      x = world.width-1;
      y += 1;
    }
    if(y == world.height) {
      y = 0;
    }
    use();
    cleanIfPossible();
  }

  public void cleanIfPossible() {
    if(world.board[y][x].isPolluted()) {
      if(canClean) {
        clean();
        canClean = false;
      } else {
        canClean = true;
      }
    }
  }
}
