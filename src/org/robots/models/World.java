package org.robots.models;

import org.robots.view.*;
import org.robots.controller.*;
import org.robots.timer.*;

import java.util.ArrayList;
import java.util.List;

public class World extends Thread {
  private int width;
  private int height;
  private Cell[][] board;
  private ArrayList<Robot> robots;

  public World(){}

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

  public int getWidth() { return width; }
  public void setWidth(int x){ width = x; }

  public int getHeight() { return height; }
  public void setHeight(int y){ height = y; }

  public Cell[][] getBoard() { return board; }
  public ArrayList<Robot> getRobots() { return robots; }


  public static void main(String[] args) {
    String envX = args.length == 0 ? "10" : args[0];
    String envY = args.length <= 1 ? "6" : args[1];
    World world = new World(Integer.parseInt(envX), Integer.parseInt(envY));

    IronMan ironMan = new IronMan(1, 0, 0, world);
    Hulk hulk       = new Hulk(2, 0, world.width-1, world);
    Loki loki       = new Loki(3, 2, 0,  world);
    Ultron ultron   = new Ultron(4, 3, 0, world);

    world.robots.add(ironMan);
    world.robots.add(hulk);
    world.robots.add(loki);
    world.robots.add(ultron);

    View v = new View(world);

    Controller ctrl = new Controller(world, v);

    Timer timer = new Timer(ctrl);
    timer.start(1000);
  }
}
