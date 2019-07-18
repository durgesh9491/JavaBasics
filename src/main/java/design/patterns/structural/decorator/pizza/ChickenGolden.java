package design.patterns.structural.decorator.pizza;

/**
 * @author durgesh.soni
 */
public class ChickenGolden extends Pizza {

    public ChickenGolden() {
        super(800, "Pizza ChickenGolden is a typical Asian pizza", true);
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
        return this.isNogveg;
    }
}
