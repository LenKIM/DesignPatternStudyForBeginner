/**
 * Created by len on 2017. 1. 11..
 */
public class GrandeSize extends SizeDecorator {

    Beverage beverage;

    public GrandeSize(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public String getSize() {
        return "사이즈는 그란데 사이즈입니다.";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
