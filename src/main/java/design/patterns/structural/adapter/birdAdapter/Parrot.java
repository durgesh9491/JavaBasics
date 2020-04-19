package design.patterns.structural.adapter.birdAdapter;

public class Parrot implements Bird {

    @Override
    public void fly() {
        System.out.println(Parrot.class.getSimpleName() + " is flying ");
    }

    @Override
    public void makeSound() {
        System.out.println("chirp chirp");
    }
}
