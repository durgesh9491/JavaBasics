package design.patterns.structural.decorator.topping;

import design.patterns.structural.decorator.pizza.Pizza;

/**
 * @author durgesh.soni
 */

public class Mushroom extends Topping {

    public Mushroom() {
        super(50, "Mushroom toppings", false);
    }

    @Override
    public int getCost() {
        return this.price;
    }

    @Override
    public String getDetails() {
        return this.description;
    }

    @Override
    public boolean isNonVegTopping() {
        return this.isNogVegTopping;
    }

    @Override
    public void decorate(Pizza pizza) {
        pizza.updatePizza(price, description, isNogVegTopping);
    }
}
