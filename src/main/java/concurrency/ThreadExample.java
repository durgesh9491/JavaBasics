package concurrency;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created By durgesh.soni on 08/04/20
 */

public class ThreadExample {
    public static void main(String[] args) {
        List<Thread> threads = Lists.newArrayList();
        for (int i = 0; i < 500; i++) {
            Runnable task = new MyRunnable(10000000L + i);
            Thread worker = new Thread(task);
            // We can set the name of the thread
            worker.setName(String.valueOf(i));
            // Start the thread, never call method run() direct
            worker.start();
            // Remember the thread for later usage
            threads.add(worker);
        }
        int running = 0;
        do {
            running = 0;
            for (Thread thread : threads) {
                if (thread.isAlive()) {
                    running++;
                }
            }
            System.out.println("We have " + running + " running threads. ");
        } while (running > 0);

    }
}