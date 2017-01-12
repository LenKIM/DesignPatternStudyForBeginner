/**
 * Created by len on 2017. 1. 12..
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded Mozzarella Cheese");
        }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
