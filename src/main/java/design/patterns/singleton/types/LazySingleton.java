package design.patterns.singleton.types;

import design.patterns.singleton.SingletonInterface;

import java.util.Objects;

/**
 * @author durgesh.soni 2019-07-13
 */
public class LazySingleton implements SingletonInterface {
    public static final String CLAZZ = "LazySingleton";
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (Objects.isNull(instance)) {
            return instance = new LazySingleton();
        }
        return instance;
    }
}