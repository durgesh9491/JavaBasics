package design.patterns.structural.bridge.vehicleEntity;

import design.patterns.structural.bridge.workshopEntity.Workshop;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Vehicle {
    protected Workshop producer;
    protected Workshop assembler;
    protected Workshop painter;

    public abstract void manufacture();
}
