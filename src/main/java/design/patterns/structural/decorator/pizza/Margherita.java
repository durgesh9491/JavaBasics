package design.patterns.structural.decorator.pizza;

/**
 * @author durgesh.soni
 */

public class Margherita extends Pizza {

    public Margherita() {
        super(500, "Pizza Margherita is a typical Neapolitan pizza", false);
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
    public boolean isNonVegPizza() {
        return this.isNogVeg;
    }
}
