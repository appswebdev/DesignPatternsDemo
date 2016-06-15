package college.edu.tomer.designpatternsdemo.ducksim;

import college.edu.tomer.designpatternsdemo.ducksim.behaviours.FlyNoWay;
import college.edu.tomer.designpatternsdemo.ducksim.behaviours.MuteQuack;

/**
 * Created by master on 15/06/16.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck(){
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("Decoy Duck");
    }
}
