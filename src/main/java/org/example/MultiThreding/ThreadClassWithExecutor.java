package org.example.MultiThreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadClassWithExecutor {

    private static int k  = 0;


    public static void main(String[] args) {
        ExecutorService service = Executors.newScheduledThreadPool(3);

        Runnable t1 = () -> {System.out.println(Thread.currentThread().getName());};
        Runnable t2 = () -> {System.out.println(Thread.currentThread().getName());};
        Runnable t3 = () -> {System.out.println(Thread.currentThread().getName());};

        service.execute(t1);
        service.execute(t2);
        service.execute(t3);
        service.shutdown();
    }



}
