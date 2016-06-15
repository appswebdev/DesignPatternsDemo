package college.edu.tomer.designpatternsdemo.ducksim.behaviours;

/**
 * Created by master on 15/06/16.
 */
public class Squeak implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Squeaking");
    }
}
