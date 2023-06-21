package org.example.Arrays;

import java.util.Arrays;

public class MaxPlatformsRequired {
    public static void main(String[] args){
        int arr[] = {100, 140, 150, 200, 215, 400};
        int dep[] = {110, 300, 210, 230,315, 600};

        System.out.println("Minimum platforms needed:"+findPlatformsRequiredForStation(arr,dep));
    }

    private static int findPlatformsRequiredForStation(int[] arr, int[] dep) {
        int i =0, j =0;
        int maxPlatforms = 0, platform_need = 0;

        Arrays.sort(arr);
        Arrays.sort(dep);

        while(i< arr.length && j < dep.length){
            if(arr[i] < dep[j]){
                platform_need++;
                i++;
                if(platform_need > maxPlatforms )
                    maxPlatforms = platform_need;
            } else{
                platform_need --;
                j++;
            }
        }
        return maxPlatforms;
    }
}
