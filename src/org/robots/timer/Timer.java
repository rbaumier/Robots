package org.robots.timer;

import org.robots.controller.*;

public class Timer extends Thread {
  public Controller ctrl;

  public Timer(){}

  public Timer(Controller controller) {
    ctrl = controller;
  }

  public void start(int speed) {
    run(speed);
  }

  public void run(int speed) {
    while(true) {
      ctrl.update();
      try {
        Thread.sleep(speed);
      } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
    }
  }
}

