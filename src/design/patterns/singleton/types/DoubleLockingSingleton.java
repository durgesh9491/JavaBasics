package design.patterns.singleton.types;

import design.patterns.singleton.SingletonInterface;

import java.util.Objects;

/**
 * @author durgesh.soni 2019-07-13
 */
public class DoubleLockingSingleton implements SingletonInterface {
    public static final String CLAZZ = "DoubleLockingSingleton";
    private static volatile DoubleLockingSingleton instance = null;

    private DoubleLockingSingleton() {
    }

    public static DoubleLockingSingleton getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (DoubleLockingSingleton.class) {
                if (Objects.isNull(instance)) {
                    return instance = new DoubleLockingSingleton();
                }
            }
        }
        return instance;
    }
}
