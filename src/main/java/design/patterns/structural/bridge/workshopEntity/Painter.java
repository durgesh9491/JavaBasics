package design.patterns.structural.bridge.workshopEntity;

public class Painter implements Workshop {
    @Override
    public void work() {
        System.out.println("vehicle is being painted");
    }
}
