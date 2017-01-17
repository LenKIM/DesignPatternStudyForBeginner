package ducks;

/**
 * Created by len on 2017. 1. 16..
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
