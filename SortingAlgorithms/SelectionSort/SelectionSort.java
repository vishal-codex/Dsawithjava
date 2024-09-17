package SortingAlgorithms.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
 int[] nums = { 5, 4, 1, 7, 6, 8, 2, 0 };
        System.out.println(Arrays.toString(selectionSortImplementation(nums)));
    }

    public static int[] selectionSortImplementation(int[] nums) {
        int maxElemIndex=0;
        for (int i = 0; i < nums.length; i++) {
          
            for (int j = 1; j < nums.length-i; j++) {
                if(nums[j]>nums[maxElemIndex]){
                    maxElemIndex=j;
                }
            }
            int temp =  nums[nums.length-1-i];
            nums[nums.length-1-i] = nums[maxElemIndex];
            nums[maxElemIndex] = temp;
        }
        return nums; 
    }
}
