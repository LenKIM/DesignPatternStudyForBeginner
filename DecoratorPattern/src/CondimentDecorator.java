/**
 * Created by len on 2017. 1. 11..
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();

    /**
     * Created by len on 2017. 1. 11..
     */
    public static class BentiSize extends SizeDecorator {

        Beverage beverage;

        public BentiSize(Beverage beverage) {
            this.beverage = beverage;
        }

        @Override
        public String getDescription() {
            return beverage.getDescription();
        }

        @Override
        public String getSize() {
            return " 사이즈는 벤티사이즈입니다.";
        }

        @Override
        public double cost() {
            return 0.20 + beverage.cost() ;
        }
    }
}
