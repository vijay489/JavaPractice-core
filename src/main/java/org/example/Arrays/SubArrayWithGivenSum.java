package org.example.Arrays;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        subArraySum(arr, n, sum);
    }

    private static void subArraySum(int[] arr, int n, int sum) {
        int curr_sum = arr[0];
        int start =0,i;

        for( i=1;i<=n;i++){

            while(curr_sum > sum && start < i -1 ) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            if(sum == curr_sum){
                System.out.println("sum found between "+start + " and "+(i-1));
            }

            if(i < n)
                curr_sum = curr_sum + arr[i];
        }
    }

}
