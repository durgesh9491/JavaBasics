package design.patterns.structural.decorator;

import design.patterns.structural.decorator.pizza.Margherita;
import design.patterns.structural.decorator.pizza.Pizza;
import design.patterns.structural.decorator.topping.Mushroom;
import design.patterns.structural.decorator.topping.Pepperoni;
import design.patterns.structural.decorator.topping.PizzaDecorator;

/**
 * @author durgesh.soni
 */
public class DemoDecorator {
    public static void main(String[] args) {


        Pizza pizza = new Margherita();

        PizzaDecorator t1 = new Mushroom();
        t1.decorate(pizza);
        System.out.println(pizza.toString());


        PizzaDecorator t2 = new Pepperoni();
        t2.decorate(pizza);

        System.out.println(pizza.toString());
    }
}
