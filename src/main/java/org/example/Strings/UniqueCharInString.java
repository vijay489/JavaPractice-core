package org.example.Strings;

import java.util.HashSet;

public class UniqueCharInString {

    public static void main(String[] args) {
        String str = "java";
        System.out.println(isAllUnique(str));

    }
    private static boolean isAllUnique(String str) {
        HashSet<Character> charset = new HashSet<>();
        for(int i = 0; i< str.length(); i++) {
            char c = str.charAt(i);
            if(!charset.add(c))
            {
                return false;
            }
        }
        return true;
    }
}
