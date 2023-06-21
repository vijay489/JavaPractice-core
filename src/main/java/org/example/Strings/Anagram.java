package org.example.Strings;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "java2blog";
        String s2 = "aj2vabgol";

        boolean isAnagrams = isAnagrams(s1, s2);

        boolean isAnagramsByChars = isAnagramsByChars("Angle","Angln");
        System.out.println("is both s1 and s2 are anagrams:" +isAnagrams);
        System.out.println("is both s1 and s2 are anagrams by isAnagramsByChars:" +isAnagramsByChars);
    }

    private static boolean isAnagramsByChars(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        for(int i=0;i<s1.length(); i++) {
            char c = s1.charAt(i);
            int index = s2.indexOf(c);
            if(index != -1) {
                s2 = s2.substring(0,index)+s2.substring(index+1);
            } else{
                return false;
            }
        }
        return true;
    }

    private static boolean isAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }

        int[] chars = new int[256];
        for(int i = 0; i< s1.length(); i++) {
            chars[s1.charAt(i)] ++;

            chars[s2.charAt(i)] --;
        }

        for (int aChar : chars) {
            if (aChar != 0) {
                return false;
            }

        }
        return true;
    }
}
