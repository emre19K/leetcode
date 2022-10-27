package Java;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2 };
        int[] arr2 = new int[] { 3, 4 };
        System.out.println(findMedianSortedArrays(arr, arr2));
    }

    /*
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
     * the median of the two sorted arrays.
     * 
     * The overall run time complexity should be O(log (m+n)).
     */

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int fal = nums1.length;
        int sal = nums2.length;
        int[] combinedArr = Arrays.copyOf(nums1, fal + sal);
        System.arraycopy(nums2, 0, combinedArr, fal, sal);
        Arrays.sort(combinedArr);
        double result = 0.0;

        if (combinedArr.length % 2 == 0) {
            result += combinedArr[combinedArr.length / 2 - 1];
            result += combinedArr[combinedArr.length / 2];
            return result / 2;

        } else {
            result += combinedArr[combinedArr.length / 2];
            return result;
        }

    }
}