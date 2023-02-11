package executorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExmp {


    public static void main(String[] args) {
//'create the pool


        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            service.execute(new Task());

        }
        System.out.println("Thread Name:" + Thread.currentThread().getName());

    }

    static class Task implements Runnable {
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }
}