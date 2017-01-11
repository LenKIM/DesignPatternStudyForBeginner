/**
 * Created by len on 2017. 1. 11..
 */
public abstract class Beverage {

    String description = "제목 없음";
    String Size = "기본";

    public String getDescription() {
        return description;
    }

    public String getSize() {
        return Size;
    }

    public abstract double cost();
}
