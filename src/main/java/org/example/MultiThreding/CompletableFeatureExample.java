package org.example.MultiThreding;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFeatureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFeatureExample ex = new CompletableFeatureExample();

        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> ex.getString1())
                .thenCompose(value -> CompletableFuture.supplyAsync(() -> value + ex.getString2()));

        cf.thenAccept(System.out::println);
        cf.get();


        CompletableFuture<CompletableFuture<String>> cf2 = CompletableFuture.supplyAsync(() -> ex.getString1())
                .thenApply(value -> CompletableFuture.supplyAsync(() -> value + ex.getString2()));

        //cf2.thenAccept(() -> System.out.println()).get();
        System.out.println("Output from cf2 : "+cf2.get().get());
    }

    public String getString1(){
        return "Hello";
    }

    public String getString2 () {
        return "I am async";
    }
}
