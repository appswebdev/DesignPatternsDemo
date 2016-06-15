package college.edu.tomer.designpatternsdemo.ducksim;

import college.edu.tomer.designpatternsdemo.ducksim.behaviours.QuackBehaviour;

/**
 * Created by master on 15/06/16.
 */
public class RubberDuck extends Duck implements QuackBehaviour {
    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }

    @Override
    public void quack() {
        System.out.println("Quack-Quack!");
    }
}
