package design.patterns.structural.bridge.workshopEntity;

public class Producer implements Workshop {
    @Override
    public void work() {
        System.out.println("vehicle is being produced");
    }
}
