package design.patterns.creational.singleton.types;

import design.patterns.creational.singleton.SingletonInterface;

/**
 * Has advantage overall
 *
 * @author durgesh.soni 2019-07-13
 */
public class BillPughSingleton implements SingletonInterface {

    public static final String CLAZZ = "BillPughSingleton";

    private BillPughSingleton() {

    }

    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
