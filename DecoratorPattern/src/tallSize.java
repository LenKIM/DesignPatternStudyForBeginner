/**
 * Created by len on 2017. 1. 11..
 */
public class tallSize extends SizeDecorator {

    Beverage beverage;

    public tallSize(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

    @Override
    public String getSize() {
        return "Tall 입니다.";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}
