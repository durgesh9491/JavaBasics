package design.patterns.structural.bridge.vehicleEntity;

import design.patterns.structural.bridge.workshopEntity.Assembler;
import design.patterns.structural.bridge.workshopEntity.Painter;
import design.patterns.structural.bridge.workshopEntity.Producer;

public class Bike extends Vehicle {

    public Bike(Producer producer, Assembler assembler, Painter painter) {
        super(producer, assembler, painter);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike is being manufactured");
        producer.work();
        assembler.work();
        painter.work();
    }
}
