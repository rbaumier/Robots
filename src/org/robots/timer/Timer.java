package org.robots.timer;

import org.robots.controller.*;

public class Timer extends Thread {
  public Controller ctrl;

  public Timer(){}

  public Timer(Controller controller) {
    ctrl = controller;
  }

  public void start(int refreshTime) {
    run(refreshTime);
  }

  public void run(int refreshTime) {
    while(true) {
      ctrl.update();
      try {
        Thread.sleep(refreshTime);
      } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
    }
  }
}

