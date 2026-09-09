package Arrays;

import java.util.*;
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 1, 2, 2, 3, 4, 4 };

        int count = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + count);
        System.out.println("Array: " + Arrays.toString(nums));
    }
}