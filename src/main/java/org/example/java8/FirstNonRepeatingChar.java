package org.example.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String args[]) {
        String str = "vb vHughnbg rauyna";

        Character result = str.chars().filter(c -> c != ' ')
                .mapToObj(cha -> Character.toLowerCase((char) cha))
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
               // .filter(entry -> entry.getValue() > 1L) -- for First Repeated character
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst().get();
        System.out.println(result);


        Character repeatingChar = findFirstRepetingChar("vbHugngrayna");

        System.out.println(repeatingChar);
    }

    public static Character findFirstRepetingChar(String str) {
        char[] charsArray = str.toCharArray();

        for (int i=0;i<str.length();i++) {
            if (str.lastIndexOf(charsArray[i]) != str.indexOf(charsArray[i])) {
                return charsArray[i];
            }
        }

        return null;
    }
}