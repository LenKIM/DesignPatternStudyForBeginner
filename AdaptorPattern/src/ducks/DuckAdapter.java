package ducks;

import java.util.Random;

/**
 * Created by len on 2017. 1. 16..
 */
public class DuckAdapter implements Turkey {

    //오리를 객체 생성이 아닌, 멤머변수를 생성한것임.
    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (rand.nextInt(5) == 0){
            duck.fly();
        }
    }
}
