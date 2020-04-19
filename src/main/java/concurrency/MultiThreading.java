package concurrency;

import java.util.concurrent.*;

public class MultiThreading {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(20);
        Runnable r = () -> System.out.println("This is runnable task");
        Callable<Integer> c = () -> {
            int x = 1005;
            return x > 1000 ? x : 1000;
        };

        Future<Integer> f = executor.submit(c);
        System.out.println("This is callable task : " + f.get());
        executor.submit(r);
    }
}
