package design.patterns.singleton;


import design.patterns.singleton.types.*;

/**
 * @author durgesh.soni 2019-07-13
 */
public final class SingletonInstanceFactory {
    public static SingletonInterface getInstance(String clazz) {
        switch (clazz) {
            case LazySingleton.CLAZZ:
                return LazySingleton.getInstance();

            case StaticBlockSingleton.CLAZZ:
                return StaticBlockSingleton.getInstance();

            case DoubleLockingSingleton.CLAZZ:
                return DoubleLockingSingleton.getInstance();

            case BillPughSingleton.CLAZZ:
                return BillPughSingleton.getInstance();

            case EagerSingleton.CLAZZ:
                return EagerSingleton.getInstance();

            default:
                return null;
        }
    }
}
