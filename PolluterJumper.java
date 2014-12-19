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

    System.out.println(xn);
    System.out.println(yn);
    // if(isFree(xn, yn)) {
    //   setPosition(xn, yn, this);
    // } else {
    //   move();
    // }
  }
}
