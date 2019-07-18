package design.patterns.structural.decorator.pizza;

/**
 * @author durgesh.soni
 */
interface DecoratedPizza {
    int getCost();

    String getDetails();

    boolean isNonVegPizza();
}
