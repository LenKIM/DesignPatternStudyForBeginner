/**
 * Created by len on 2017. 1. 11..
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "디카페인커피입니다";
    }

    @Override
    public double cost() {
        return 50;
    }
}
