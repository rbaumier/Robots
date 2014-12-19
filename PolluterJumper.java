import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PolluterJumper extends RobotPolluter {
  public PolluterJumper(int num, int x, int y, World world) {
    super(num, x, y, world);
  }

  public void move() {
    List<Integer> pos = new ArrayList<Integer>();
    pos.add(-2);
    pos.add(-1);
    pos.add(1);
    pos.add(2);

    Random random = new Random();

    int xn = x+pos.get(random.nextInt(3 - 0 + 1) + 0);
    int yn = x+pos.get(random.nextInt(3 - 0 + 1) + 0);

    if(world.isValidCell(xn, yn) && world.isFree(xn, yn)) {
      x = xn;
      y = yn;
      world.setPosition(x, y, this);
    } else {
      move();
    }
  }
}
