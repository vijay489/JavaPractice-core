package org.example.java8;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindPercentageOfEachElement {
    public static void main(String[] args) {
        List<String> input = List.of("FOO", "FOO", "FOO", "FOO", "FOO", "BAR",
                        "BAR", "BAZ", "BAZ", "BAZ", "DOO", "DOO");

        Map<String,String> res = input.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.collectingAndThen(Collectors.counting(),
                        count -> String.valueOf(Math.round(((double) count / input.size() * 100 ))))));

        res.forEach((k,v) -> System.out.println("Key:" +k +", Value : "+v));
    }
}
