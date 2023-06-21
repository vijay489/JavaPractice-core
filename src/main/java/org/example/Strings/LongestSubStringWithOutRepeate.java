package org.example.Strings;

public class LongestSubStringWithOutRepeate {
    public static void main(String[] args) {
        String str = "abcabcbb";
        longestSubStringLength(str,str.length());

        longestSubStringBestApproach(str,str.length());
    }

    private static void longestSubStringBestApproach(String str, int n) {
        String test ="";
        int max = 0;
        if(str.length() == 0)
            return;
        else if(str.length() == 1)
            System.out.println("Size:" +str.length());

        for(char ch : str.toCharArray()){
            String s = String.valueOf(ch);
            if(test.contains(s))
                test = test.substring(test.indexOf(s)+1);

             test = test + s;
             max = Math.max(max,test.length());
        }
        System.out.println("Size:" +max );

    }

    private static void longestSubStringLength(String str, int n) {
        int max = 0;

        for(int i=0;i<n;i++){
            boolean[] visited = new boolean[256];
            for(int j=i;j<n;j++){
                if(visited[str.charAt(j)])
                    break;
                else {
                    max = Math.max(max,j-i+1);
                    visited[str.charAt(j)] = true;
                }
            }
            visited[str.charAt(i)] = false;
        }

        System.out.println("size of longest substring is :" + max);
    }
}
