package org.example.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[]={16,19,21,25,3,5,8,10};

        System.out.println("Index of element 5 : "
                +findElementRotatedSortedArray(arr,0,arr.length-1,5));
    }

    private static int findElementRotatedSortedArray(int[] arr, int low, int high, int n) {
      int mid ;

      while(low <= high)
      {
          mid = low + ((high - low) /2);

          if(arr[mid] == n)
              return  mid;

          if(arr[mid] <= arr[high]) {
              if(n > arr[mid] && n <= arr[high])
                  low = mid + 1;
              else
                  high = mid -1;
          } else {
              if(arr[low] <= n && n < arr[mid])
                  high = mid -1;
              else
                  low = mid + 1;
          }
      }
      return -1;
    }
}
