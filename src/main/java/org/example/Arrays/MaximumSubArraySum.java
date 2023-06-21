package org.example.Arrays;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        maximumSubArraySum(arr);
    }

    private static void maximumSubArraySum(int[] arr) {
        int max_so_far = arr[0], max_ending = arr[0];

        int start = 0, end = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i] > max_ending + arr[i])
            {
                start = i;
                max_ending = arr[i];
            } else{
                max_ending = max_ending+arr[i];
            }


            if(max_so_far < max_ending)
            {
                max_so_far = max_ending;
                end = i;
            }
        }

        System.out.println("Maximum sum of subArray is : "+max_so_far);
    }
}
