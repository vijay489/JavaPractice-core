package org.example.Arrays;

import java.util.Arrays;

public class SortArrayEvenBigandOddSmallValues {
 public static void main(String[]  args) {
     int n = 5;
     int arr[] = { 4, 3, 2, 2, 5 };
     rearrange(arr, n);
 }

    private static void rearrange(int[] arr, int n) {
      for(int i=1;i<n;i++) {
          if (i % 2 == 0) {
              if (arr[i] > arr[i - 1]) {
                  int temp = arr[i];
                  arr[i ] = arr[i - 1];
                  arr[i -1 ] = temp;
              }
          } else  {
              if(arr[i] < arr[i-1]) {
                  int temp = arr[i];
                  arr[i ] = arr[i - 1];
                  arr[i -1 ] = temp;
              }
          }
      }
        Arrays.stream(arr).forEach(s -> System.out.print(s+" "));

    }
}
