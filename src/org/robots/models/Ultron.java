package org.robots.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ultron extends RobotPolluter {
  public int[][] pos = {
    { -1, 1 }, {-2, 2}
  };


  public Ultron(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void release() {
    getWorld().getBoard()[getY()][getX()].release();
  }

  public void move() {
    int rAx = new Random().nextInt((1 - 0) + 1);
    int rBx = new Random().nextInt((1 - 0) + 1);

    int rAy = rAx == 0 ? 1 : 0;
    int rBy = rAx == 0 ? 1 : 0;

    int xn = getX() + pos[rAx][rBx];
    int yn = getY() + pos[rAy][rBy];

    if(getWorld().isValidCell(xn, yn)) {
      setX(xn);
      setY(yn);
      use();
      pollute();
    } else {
      move();
    }

  }
}
