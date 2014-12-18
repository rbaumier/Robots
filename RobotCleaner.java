public class RobotCleaner extends Robot {

  public RobotCleaner(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void clean() {
    world.board[x][y].clean();
  }

  //boustrophedon
  public void roam(int sleepTime) {
    roamFromTop(sleepTime);
    roamFromBottom(sleepTime);
    roam(sleepTime);
  }

  public void roamFromBottom(int sleepTime) {
    for (int i = this.world.height-1; i >= 0; i--) {
      if (i%2 != 0) {
        for (int j = 0; j < this.world.width; j++) {
          this.clean();
          sleep(sleepTime);
          this.world.setPosition(i,j,this);
        }
      } else {
        for (int k = this.world.width-1; k >= 0; k--) {
          this.clean();
          sleep(sleepTime);
          this.world.setPosition(i,k,this);
       }
     }
   }
 }

  public void roamFromTop(int sleepTime) {
    for (int i = 0; i < this.world.height; i++) {
      if (i%2 == 0) {
        for (int j = 0; j < this.world.width; j++) {
          this.clean();
          sleep(sleepTime);
          this.world.setPosition(i,j,this);
        }
      } else {
        for (int k = this.world.width-1; k >= 0; k--) {
          this.clean();
          sleep(sleepTime);
          this.world.setPosition(i,k,this);
        }
      }
    }
  }

}
