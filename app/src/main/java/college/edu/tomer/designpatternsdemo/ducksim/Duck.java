package college.edu.tomer.designpatternsdemo.ducksim;

import college.edu.tomer.designpatternsdemo.ducksim.behaviours.FlyBehaviour;
import college.edu.tomer.designpatternsdemo.ducksim.behaviours.FlyWithWings;
import college.edu.tomer.designpatternsdemo.ducksim.behaviours.Quack;
import college.edu.tomer.designpatternsdemo.ducksim.behaviours.QuackBehaviour;

/**
 * Created by master on 15/06/16.
 */
public abstract class Duck {
    protected QuackBehaviour quackBehaviour = new Quack();
    protected FlyBehaviour flyBehaviour = new FlyWithWings();


    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }
    public void swim(){
        System.out.println("Swimming");
    }

    public abstract void display();
}
