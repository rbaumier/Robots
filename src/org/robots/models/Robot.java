package org.robots.models;

public abstract class Robot {
  private int id;
  private int x;
  private int y;
  private World world;

  public Robot(){}

  public Robot(int num, int coordY, int coordX, World w) {
    id = num;
    x = coordX;
    y = coordY;
    world = w;
  }

  public void use() {
    getWorld().getBoard()[y][x].use(this);
  }

  public void move() {}

  public void release() {
    getWorld().getBoard()[y][x].release();
  }

  public int getId() { return id; }
  public void setId(int num) { id = num; }

  public int getX() { return x; }
  public void setX(int newX) { x = newX; }

  public int getY() { return y; }
  public void setY(int newY) { y = newY; }

  public World getWorld() { return world; }
  public void setWorld(World w) { world = w; }
}


