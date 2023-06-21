package org.example.MultiThreding;

import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThredingUsingJava8 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        IntStream.range(1 , 100).forEach(i -> service.submit(new Task(i)));
    }
}

    final class Task implements Runnable{
        private  int taskId;
        public Task(int t){
            this.taskId = t;
        }

        @Override
        public void run() {
            System.out.println("Task ID : " + this.taskId +" performed by "
                    + Thread.currentThread().getName());
        }
    }

