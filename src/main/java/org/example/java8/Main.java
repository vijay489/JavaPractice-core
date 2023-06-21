package org.example.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().distinct().collect(Collectors.toList()).forEach(s -> System.out.print(s+" "));
        System.out.println();
        System.out.println("Maximum value : "+myList.stream().max(Integer::compare).get());

        Integer res = myList.stream().collect(Collectors.groupingBy(c -> c , LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1L)
                .map(Map.Entry::getKey)
                .findFirst().get();

        System.out.println("First repeating int: " +res);
    }
}