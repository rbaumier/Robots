package org.robots.models;

import org.robots.view.*;
import org.robots.controller.*;
import org.robots.timer.*;

import java.util.ArrayList;
import java.util.List;

public class World extends Thread {
  public int width;
  public int height;
  public Cell[][] board;
  public ArrayList<Robot> robots;

  public World(){};

  public World(int x, int y) {
    if(hasCorrectSize(x, y)) {
      width = x;
      height = y;
      robots = new ArrayList<Robot>();
      board = fill(new Cell[height][width]);
    } else {
      System.out.println("La taille du tableau depasse la taille limite (20,30)");
    }
  }

  public static boolean hasCorrectSize(int width, int height) {
    return width <= 30 && height <= 20;
  }

  public boolean isValidCell(int x, int y) {
    return x < width && x >= 0  && y >= 0 && y < height;
  }

  public Cell[][] fill(Cell[][] board) {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        board[i][j] = new Cell();
      }
    }
    return board;
  }

  public static void main(String[] args) {
    String envX = args.length == 0 ? "10" : args[0];
    String envY = args.length <= 1 ? "6" : args[1];
    World world = new World(Integer.parseInt(envX), Integer.parseInt(envY));

    // RobotCleaner robotCleaner = new RobotCleaner(1, 0, 0, world);
    // CleanerDistract cleanerDistract = new CleanerDistract(2, 0, world.width-1, world);
    // RobotPolluter robotPolluter = new RobotPolluter(3, 2, 0,  world);
    PolluterJumper polluterJumper = new PolluterJumper(4, 3, 0, world);

    // world.robots.add(robotCleaner);
    // world.robots.add(cleanerDistract);
    // world.robots.add(robotPolluter);
    world.robots.add(polluterJumper);

    View v = new View(world);

    Controller ctrl = new Controller(world, v);

    Timer timer = new Timer(ctrl);
    timer.start(1000);
  }
}
