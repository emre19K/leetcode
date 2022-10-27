package Java.TwoSum;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 5, 5, 4 };
        int target = 10;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    /*
     * Given an array of integers nums and an integer target, return indices of the
     * two numbers such that they add up to target.
     * 
     * You may assume that each input would have exactly one solution, and you may
     * not use the same element twice.
     * 
     * You can return the answer in any order.
     */

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i - 1] == nums[j] && j == i - 1) {
                    continue;
                }
                if (nums[i - 1] + nums[j] == target) {
                    result[0] = i - 1;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}