package SortingAlgorithms.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 1, 7, 6, 8, 2, 0 };
        System.out.println(Arrays.toString(bubbleSortImplementation(nums)));
    }

    public static int[] bubbleSortImplementation(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }

        int point = 0;
        int index = 0;
        // will take n*n time complexity
        while (point < nums.length) {
            if (index < nums.length - point - 1) {
                if (nums[index] > nums[index + 1]) {
                    int temp = nums[index];
                    nums[index] = nums[index + 1];
                    nums[index + 1] = temp;
                    index++;
                } else
                    index++;
            } else {
                point++;
                index = 0;
            }

        }
        // will take n*n time complexity as well

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }
}