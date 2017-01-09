/**
 * Created by len on 2017. 1. 8..
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Quite >>");
    }
}
