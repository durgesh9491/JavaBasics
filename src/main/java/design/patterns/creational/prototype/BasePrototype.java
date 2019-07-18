package design.patterns.creational.prototype;

/**
 * @author durgesh.soni 2019-07-13
 */
public interface BasePrototype extends Cloneable {
    BasePrototype clone() throws CloneNotSupportedException;
}
