package org.example.SearchAndSort;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Given array is");
        printArray(arr);
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        printArray(arr);
    }

    private void sort(int[] arr, int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);

            mergeSort(arr,start,mid,end);
        }
    }

    private void mergeSort(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        //copy data into temp arrays
        for(int i=0;i<n1;++i)
            left[i] = arr[start+i];
        for(int j=0;j<n2;++j)
            right[j] = arr[mid+1+j];

        // main sorting logic
        int i=0,j=0,k=start;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while(i < n1){
            arr[k++] = left[i++];
        }

        while(j < n2) {
            arr[k++] = right[j++];
        }

    }

    private static void printArray(int[] arr) {
        for(int i: arr)
            System.out.print(i+" ");

        System.out.println();
    }
}
