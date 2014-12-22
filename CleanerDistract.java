public class CleanerDistract extends RobotCleaner {
  public boolean canClean = true;

  public CleanerDistract(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void clean() {
    if(world.board[x][y].isPolluted()) {
      if(canClean) {
        world.board[x][y].clean();
        canClean = false;
      } else {
        canClean = true;
      }
    }
  }
}
