/**
 * Created by len on 2017. 1. 11..
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , 두유";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
