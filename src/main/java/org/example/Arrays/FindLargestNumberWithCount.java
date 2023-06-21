package org.example.Arrays;

public class FindLargestNumberWithCount {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,3,8};
        countMaximumValue(arr);
    }

    private static void countMaximumValue(int[] arr) {
        int n = arr.length;
        int count =0;
        int max = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i] > max)
            {
                max = arr[i];
                count = 1;
            } else if(arr[i] == max)
                count++;
        }

        System.out.println("max value: "+max +" occured : " +count);
    }
}
