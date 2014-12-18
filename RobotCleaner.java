public class RobotCleaner extends Robot {

  public RobotCleaner(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void clean() {
    // this.world[this.x][this.y].clean();
  }

  //boustrophedon
  public void roam(int speed) {
    System.out.println("coucou");
    // from top
    for (int i = 0; i < this.world.width; i++) {
      if (i%2 == 0) {
        for (int j = 0; j < this.world.width; j++) {
          this.world.setPosition(i,j,this);
          sleep(speed);
          //System.out.println(this.world[i][j].show());
        }
      } else {
        for (int k = this.world.width-1; k >= 0; k--) {
          this.world.setPosition(i,k,this);
          sleep(speed);
          // System.out.println(this.world[i][k].show());
        }
      }
    }

    // from bottom
    for (int i = this.world.width-1; i >= 0; i--) {
      if (i%2 != 0) {
        for (int j = 0; j < this.world.width; j++) {
          this.world.setPosition(i,j,this);
          sleep(speed);
          // System.out.println(this.world[i][j].show());
        }
      } else {
        for (int k = this.world.width-1; k >= 0; k--) {
          this.world.setPosition(i,k,this);
          sleep(speed);
          // System.out.println(this.world[i][k].show());
        }
      }
    }
  }
}
