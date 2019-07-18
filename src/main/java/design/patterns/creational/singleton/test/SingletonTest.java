package design.patterns.creational.singleton.test;

import design.patterns.creational.singleton.SingletonInstanceFactory;
import design.patterns.creational.singleton.SingletonInterface;
import design.patterns.creational.singleton.types.*;

import java.util.concurrent.*;

/**
 * @author durgesh.soni 2019-07-13
 */
public class SingletonTest {
    private final int THREAD_COUNT = 100;
    private ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SingletonTest demo = new SingletonTest();
        demo.testSingleton(BillPughSingleton.CLAZZ);
        demo.testSingleton(DoubleLockingSingleton.CLAZZ);
        demo.testSingleton(EagerSingleton.CLAZZ);
        demo.testSingleton(LazySingleton.CLAZZ);
        demo.testSingleton(StaticBlockSingleton.CLAZZ);

        System.out.println("Testing for : " + SingletonTest.class.getSimpleName() + " is done!");
    }

    private void testSingleton(String clazz) throws ExecutionException, InterruptedException {
        for (int i = 0; i < 100000; i++) {
            Callable<SingletonInterface> r1 = () -> SingletonInstanceFactory.getInstance(clazz);

            Callable<SingletonInterface> r2 = () -> SingletonInstanceFactory.getInstance(clazz);

            Future<SingletonInterface> f1 = executor.submit(r1);
            Future<SingletonInterface> f2 = executor.submit(r2);

            if (!f1.get().equals(f2.get())) {
                System.out.println(clazz + " ------ Object are not equal ------ ");
            }
        }
    }
}
