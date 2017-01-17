package ducks;

/**
 * Created by len on 2017. 1. 16..
 */
public class WildTurkey implements Turkey {


    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
