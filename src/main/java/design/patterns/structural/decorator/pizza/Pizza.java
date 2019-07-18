package design.patterns.structural.decorator.pizza;

import lombok.AllArgsConstructor;

/**
 * @author durgesh.soni
 */

@AllArgsConstructor
public abstract class Pizza implements DecoratedPizza {
    protected int price;
    protected String description;
    protected boolean isNogveg;

    @Override
    public String toString() {
        return "Price : " + price + " description :" + description + " isNonVeg :" + isNogveg;
    }

    public void updatePizza(int price, String description, boolean isNonVeg) {
        this.price += price;
        this.description += " " + description;
        this.isNogveg |= isNonVeg;
    }
}
