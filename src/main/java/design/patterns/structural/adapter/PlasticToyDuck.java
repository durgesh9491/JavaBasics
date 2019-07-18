package design.patterns.structural.adapter;

public class PlasticToyDuck implements ToyDuck {
    @Override
    public void squeak() {
        System.out.println(PlasticToyDuck.class.getSimpleName() + " quick quick");
    }
}
