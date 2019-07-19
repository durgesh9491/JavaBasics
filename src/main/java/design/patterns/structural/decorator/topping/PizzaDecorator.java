package design.patterns.structural.decorator.topping;

import design.patterns.structural.decorator.pizza.Pizza;

/**
 * @author durgesh.soni
 */
public interface PizzaDecorator {
    int getCost();

    String getDetails();

    boolean isNonVegTopping();

    void decorate(Pizza pizza);
}
