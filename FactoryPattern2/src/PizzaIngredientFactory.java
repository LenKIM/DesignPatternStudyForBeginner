/**
 * Created by len on 2017. 1. 12..
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSause();
    public Cheese createCheese();
    public Veggies [] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
