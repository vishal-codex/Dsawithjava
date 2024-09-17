package SortingAlgorithms.InsertionSort;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 1, 7, 6, 8, 2, 0 };
        System.out.println(Arrays.toString(insertionSortImplementation(nums)));
    }

    public static int[] insertionSortImplementation(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;
            // Move elements that are greater than current to one position ahead
            while (j >= 0 && nums[j] > current) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
        return nums;
    }
}
