public class RobotCleaner extends Robot {
  public RobotCleaner(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void clean() {
    world.board[x][y].clean();
  }

  public void move() {
    y += 1;
    if(y == world.width) {
      y = 0;
      x += 1;
    }
    if(x == world.height) {
      x = 0;
    }
    use();
    clean();
  }
}
