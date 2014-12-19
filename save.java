 //  public void roamFromBottom() {
 //    for (int i = this.world.height-1; i >= 0; i--) {
 //      if (i%2 != 0) {
 //        for (int j = 0; j < this.world.width; j++) {
 //          this.clean();
 //          this.world.setPosition(i,j,this);
 //        }
 //      } else {
 //        for (int k = this.world.width-1; k >= 0; k--) {
 //          this.clean();
 //          this.world.setPosition(i,k,this);
 //       }
 //     }
 //   }
 // }

 //  public void roamFromTop() {
 //    for (int i = 0; i < this.world.height; i++) {
 //      if (i%2 == 0) {
 //        for (int j = 0; j < this.world.width; j++) {
 //          this.clean();
 //          this.world.setPosition(i,j,this);
 //        }
 //      } else {
 //        for (int k = this.world.width-1; k >= 0; k--) {
 //          this.clean();
 //          this.world.setPosition(i,k,this);
 //        }
 //      }
 //    }
 //  }

 //  //boustrophedon
 //  public void roam() {
 //    roamFromTop();
 //    roamFromBottom();
 //    roam();
 //  }

 //  public void roam() {
 //    for (int i = this.world.height-1; i >= 0; i--) {
 //      for (int j = 0; j < this.world.width; j++) {
 //        this.pollute();
 //        sleep();
 //        this.world.setPosition(i,j,this);
 //      }
 //    }
 //    roam();
 //  }


  // public void roam(int sleepTime) {
  //   //TODO : question 11. = cavaliers echecs
  //   for (int i = 0; i < this.world.height; i++) {
  //     for (int j = 0; j < this.world.width; j++) {
  //       this.pollute();
  //       this.world.setPosition(i,j,this);
  //       sleep(sleepTime);
  //     }
  //   }
  //   roam(sleepTime);
  // }
