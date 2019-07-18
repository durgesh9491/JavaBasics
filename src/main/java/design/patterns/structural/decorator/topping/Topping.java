package design.patterns.structural.decorator.topping;

import design.patterns.structural.decorator.pizza.Pizza;
import lombok.AllArgsConstructor;

/**
 * @author durgesh.soni
 */
@AllArgsConstructor
public abstract class Topping implements PizzaDecorator {
    protected int price;
    protected String description;
    protected boolean isNogVegTopping;
}
