package org.example.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfArray {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3,1};
        List<List<Integer>> result = printAllPermutations(arr);
        for(List<Integer> r : result)
            System.out.print(r+" ");
    }

    private static List<List<Integer>> printAllPermutations(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        permutationsUtil(res,new ArrayList<>(),arr,new boolean[arr.length]);
        return res;
    }

    private static void permutationsUtil(List<List<Integer>> res, ArrayList<Integer> tempRes,
                                         int[] arr, boolean[] used) {
        if(tempRes.size() == arr.length)
            res.add(new ArrayList<>(tempRes));
        else{
            for(int i=0;i<arr.length;i++){
                if(used[i] || i > 0 && arr[i] == arr[i-1] && !used[i - 1])
                    continue;

                used[i] = true;
                tempRes.add(arr[i]);
                permutationsUtil(res,tempRes,arr,used);
                used[i] = false;
                tempRes.remove(tempRes.size() -1);
            }
        }
    }
}
