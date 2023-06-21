package org.example.java8;

import java.util.Map;
import java.util.stream.Collectors;

public class PrintCountofDupChars {
    public static void main(String[] args) {
        String str = "abccdeffsa";

         str.chars().mapToObj(c -> (char) c)
                 .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                 .forEach((key, value) -> System.out.println("key:" + key + " and value :" + value));
    }
}
