package org.example.Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2,5};

        mergeArrays(arr1,arr2);
    }

    private static void mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] arr = new int[n+m];

        int i=0,j=0,k=0;

        while(i< n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            }
            else {
                arr[k++] = arr2[j++];
            }
        }

        while(i<n)
            arr[k++] = arr1[i++];
        while(j<m)
            arr[k++] = arr2[j++];

        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
         int len = arr.length;

         if(len%2 != 0) {
             System.out.println("median: "+arr[len/2]);
         } else
             System.out.println("Median : "+ (arr[len/2 - 1]+ arr[(len/2 - 1)+1])/2);
    }
}
