package org.robots.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PolluterJumper extends RobotPolluter {
  List<Integer> pos;

  public PolluterJumper(int num, int x, int y, World world) {
    super(num, x, y, world);
    pos = new ArrayList<Integer>();
    pos.add(-2);
    pos.add(-1);
    pos.add(1);
    pos.add(2);
  }

  public void release() {
    world.board[y][x].release();
  }

  // public void move() {
  //   Random random = new Random();

  //   int xn = x+pos.get(random.nextInt(3 - 0 + 1) + 0);
  //   int yn = x+pos.get(random.nextInt(3 - 0 + 1) + 0);

  //   if(world.isValidCell(xn, yn) && world.board[xn][yn].isFree()) {
  //     x = xn;
  //     y = yn;
  //     world.board[x][y].pollute();
  //     world.board[x][y].use(this);
  //   } else {
  //     move();
  //   }
  // }
}
