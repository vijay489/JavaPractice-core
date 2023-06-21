package org.example.Strings;

public class PrintAllPermutationsOfString {
    public static void main(String[] args) {
        String str = "abcd";
        printPermutations(str,"");
    }

    private static void printPermutations(String str, String s) {
        if(str.length() == 0) {
            System.out.print(s +" ");
            return;
        }
        boolean[] alpa = new boolean[26];
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            String s2 = str.substring(0,i) + str.substring(i+1);
            if(!alpa[ch - 'a']) {
                printPermutations(s2, s + ch);
                alpa[ch - 'a'] = true;
            }
        }
    }

}
