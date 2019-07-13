package design.patterns.singleton.types;

import design.patterns.singleton.SingletonInterface;

/**
 * @author durgesh.soni 2019-07-13
 */
public class StaticBlockSingleton implements SingletonInterface {
    public static final String CLAZZ = "StaticBlockSingleton";
    private static volatile StaticBlockSingleton instance;

    static {
        instance = new StaticBlockSingleton();
    }

    private StaticBlockSingleton() {
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
