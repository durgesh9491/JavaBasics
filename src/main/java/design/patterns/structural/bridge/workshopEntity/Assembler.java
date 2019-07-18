package design.patterns.structural.bridge.workshopEntity;

public class Assembler implements Workshop {
    @Override
    public void work() {
        System.out.println("Vehicle is being assembled");
    }
}
