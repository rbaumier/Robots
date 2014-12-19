public class Timer extends Thread {
  public Controller ctrl;

  public Timer(){};

  public Timer(Controller controller) {
    ctrl = controller;
  }

  public void run() {
    while(true) {
      ctrl.update();
      try {
        Thread.sleep(1000);
      } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
    }
  }
}

