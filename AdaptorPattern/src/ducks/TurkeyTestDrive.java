package ducks;

/**
 * Created by len on 2017. 1. 16..
 */
public class TurkeyTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        for (int i = 0; i < 10; i++) {
            System.out.println("The ducks.DuckAdapter  says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}
