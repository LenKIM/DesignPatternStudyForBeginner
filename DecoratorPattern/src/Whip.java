/**
 * Created by len on 2017. 1. 11..
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +  ", 휘핑 크림";
    }

    @Override
    public double cost() {
        return .2 + beverage.cost();
    }
}
