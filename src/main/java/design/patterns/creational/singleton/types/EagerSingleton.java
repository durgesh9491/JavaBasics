package design.patterns.creational.singleton.types;

import design.patterns.creational.singleton.SingletonInterface;

/**
 * @author durgesh.soni 2019-07-13
 */

public class EagerSingleton implements SingletonInterface {
    public static final String CLAZZ = "EagerSingleton";
    private static volatile EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}