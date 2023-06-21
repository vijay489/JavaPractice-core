package org.example.Strings;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        System.out.println("Length is: " + longestPalindromeString(str));
    }

    private static String longestPalindromeString(String str) {

        if(str.length() < 2)
            return str;

        String longest = str.substring(0,1);
        for(int i=0;i<str.length() -1 ;i++) {
            //odd length string
            String palindrome = intermediatePalindrome(str,i,i);

            if(palindrome.length() > longest.length())
                longest = palindrome;

            //even length string
            palindrome = intermediatePalindrome(str,i,i+1);
            if(palindrome.length() > longest.length())
                longest = palindrome;
        }
        return longest;
    }

    private static String intermediatePalindrome(String str, int low, int high) {
        if (low > high)
            return null;

        while (low >= 0 && high < str.length()
                && str.charAt(low) == str.charAt(high)) {
            low--;
            high++;
        }
        return str.substring(low + 1, high);
    }
}
