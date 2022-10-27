package Java.TwoSum;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] + nums[i] == target){
                result[0] = i-1;
                result[1] = i;
                return result;
            }
        } return null;
    }
}