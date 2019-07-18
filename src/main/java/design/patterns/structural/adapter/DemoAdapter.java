package design.patterns.structural.adapter;

/**
 * @link https://refactoring.guru/design-patterns/adapter
 */
public class DemoAdapter {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        PlasticToyDuck toy = new PlasticToyDuck();

        parrot.fly();
        parrot.makeSound();
        toy.squeak();

        ToyDuck toyDuck = new BirdAdapter(parrot);
        System.out.println("BirdAdapter...");
        toyDuck.squeak();
    }
}
