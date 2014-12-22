public class Controller {
  public World world;
  public View view;

  public Controller() {}

  public Controller(World w, View v) {
    world = w;
    view = v;
  }

  public void update() {
    for(Robot r : world.robots) {
      r.release();
      r.move();
    }
    view.repaint();
  }
}
