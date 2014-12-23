package org.robots.models;

public class RobotCleaner extends Robot {
  public RobotCleaner(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void clean() {
    world.board[y][x].clean();
  }

  public void move() {
    if((x == world.width-1) && ((y == 0 && world.width%2 == 0) || (world.width % 2 != 0 && y == world.height-1))) {
      if(world.width % 2 == 0 && y == 0) {
        x = 0;
        y = 0;
      } else {
        if (world.width % 2 != 0 && y == world.height-1) {
          x = 0;
          y = 0;
        }
      }
    } else {
      if(x%2 == 0) {
        if(y == world.height-1) {
          if(x%2 == 0) {
            x += 1;
          } else {
            y -= 1;
          }
        } else {
          y += 1;
        }
      } else {
        if(y == 0) {
          x+= 1;
        } else {
          y -= 1;
        }
      }
    }
    use();
    clean();
  }
}
