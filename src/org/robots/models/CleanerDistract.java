package org.robots.models;

public class CleanerDistract extends RobotCleaner {
  public boolean canClean = true;

  public CleanerDistract(int num, int x, int y, World world) {
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
    clean();
  }

  public void clean() {
    if(world.board[y][x].isPolluted()) {
      if(canClean) {
        world.board[y][x].clean();
        canClean = false;
      } else {
        canClean = true;
      }
    }
  }
}
