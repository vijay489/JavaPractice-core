package org.example.Strings;

public class AllSubStringsofString {
    public static void main(String[] args) {
        String str = "abbc";

        /*for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }*/

        for(int i=0;i<str.length();i++){
            String subString = "";
            for(int j=i;j<str.length();j++){
                subString += str.charAt(j);
                System.out.println(subString);
            }
        }
    }
}
