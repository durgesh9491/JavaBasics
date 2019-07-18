package design.patterns.structural.decorator.topping;

import design.patterns.structural.decorator.pizza.Pizza;

/**
 * @author durgesh.soni
 */
public class Pepperoni extends Topping {
    public Pepperoni() {
        super(70, "Pepperoni toppings", true);
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
