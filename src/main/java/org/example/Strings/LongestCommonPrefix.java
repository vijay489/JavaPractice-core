package org.example.Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println( "The longest Common Prefix is : " + longestCommonPrefix(input));
    }

    private static String longestCommonPrefix(String[] input) {
        int n = input.length;
        if(n == 0)
            return "";

        if(n == 1)
            return input[0];

        Arrays.sort(input);
        int end = Math.min(input[0].length(),input[n-1].length());

        int i = 0;
        while(i < end && input[0].charAt(i) == input[n-1].charAt(i))
            i++;

        String commonPrefix = input[0].substring(0,i);
        return commonPrefix;
    }
}
