public class Controller {
  public World world;

  public Controller() {}

  public Controller(World w) {
    world = w;
  }

  public void update() {
    for(Robot r : world.robots) {
      r.move();
    }
  }
}
