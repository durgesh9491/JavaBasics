package design.patterns.structural.bridge.vehicleEntity;

import design.patterns.structural.bridge.workshopEntity.Assembler;
import design.patterns.structural.bridge.workshopEntity.Painter;
import design.patterns.structural.bridge.workshopEntity.Producer;

public class Car extends Vehicle {

    public Car(Producer producer, Assembler assembler, Painter painter) {
        super(producer, assembler, painter);
    }

    @Override
    public void manufacture() {
        System.out.println("Car is under construction");
        producer.work();
        assembler.work();
        painter.work();
    }
}
