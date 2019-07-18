package design.patterns.structural.bridge;

import design.patterns.structural.bridge.vehicleEntity.Car;
import design.patterns.structural.bridge.vehicleEntity.Vehicle;
import design.patterns.structural.bridge.workshopEntity.Assembler;
import design.patterns.structural.bridge.workshopEntity.Painter;
import design.patterns.structural.bridge.workshopEntity.Producer;

public class DemoBridge {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Producer(), new Assembler(), new Painter());
        vehicle.manufacture();
    }
}
