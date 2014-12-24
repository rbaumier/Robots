package org.robots.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PolluterJumper extends RobotPolluter {
  public int[][] pos = {
    { -1, 1 }, {-2, 2}
  };


  public PolluterJumper(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void release() {
    world.board[y][x].release();
  }

  public void move() {
    int rAx = new Random().nextInt((1 - 0) + 1);
    int rBx = new Random().nextInt((1 - 0) + 1);

    int rAy = rAx == 0 ? 1 : 0;
    int rBy = rAx == 0 ? 1 : 0;

    int xn = x + pos[rAx][rBx];
    int yn = y + pos[rAy][rBy];

    if(world.isValidCell(xn, yn)) {
      x = xn;
      y = yn;
      use();
      pollute();
    } else {
      move();
    }

  }
}
