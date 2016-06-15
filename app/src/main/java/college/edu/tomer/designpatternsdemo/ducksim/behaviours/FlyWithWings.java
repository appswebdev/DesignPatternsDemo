package college.edu.tomer.designpatternsdemo.ducksim.behaviours;

/**
 * Created by master on 15/06/16.
 */
public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying... with wings");
    }
}
