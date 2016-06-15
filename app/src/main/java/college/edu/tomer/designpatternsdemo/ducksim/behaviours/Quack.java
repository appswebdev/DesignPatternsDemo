package college.edu.tomer.designpatternsdemo.ducksim.behaviours;

/**
 * Created by master on 15/06/16.
 */
public class Quack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Quack-Quack!");
    }
}
