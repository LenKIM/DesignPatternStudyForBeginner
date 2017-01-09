/**
 * Created by len on 2017. 1. 8..
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoway();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
