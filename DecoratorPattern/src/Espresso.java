/**
 * Created by len on 2017. 1. 11..
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레소";
        //여기서 내가 description을 쓸수 있다니?
//        상속받았기에 가능
    }

//    @Override
    public double cost() {
        return 1.99;
    }
}
