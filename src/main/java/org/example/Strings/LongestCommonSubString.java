package org.example.Strings;

public class LongestCommonSubString {

    public static void main(String[] args) {
        String X = "OldSite:GeeksforGeeks.org";
        String Y = "NewSite:GeeksQuiz.com";

       longestCommonSubString(X,Y);

       longestCommonSubStringDP(X.toCharArray(),Y.toCharArray(),X.length(),Y.length());
    }

    private static void longestCommonSubStringDP(char[] str1, char[] str2,
                                                 int n, int m) {

        int[][] dp = new int[n+1][m+1];
        int mx = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0)
                    dp[i][j] = 0;
                else if(str1[i -1] == str2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                    mx = Integer.max(mx,dp[i][j]);
                } else{
                    dp[i][j] = 0;
                }
            }
        }
        System.out.println("Longest common substring length using DP : " + mx);
    }

    private static void longestCommonSubString(String x, String y) {
        int ans = 0;

        for(int i=0;i<x.length();i++){
            for(int j=0;j<y.length();j++){
                int k = 0;
                while((i+k) < x.length() && (j+k) < y.length() && x.charAt(i+k) == y.charAt(j+k))
                {
                    k = k+1;
                }
                ans = Math.max(ans,k);
            }
        }

        System.out.println("Longest common substring length: " + ans);
    }

}
