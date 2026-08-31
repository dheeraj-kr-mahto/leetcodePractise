
// LeetCode 643 — Maximum Average Subarray I
// Question

// Given an integer array nums and an integer k, find the maximum average value of any contiguous subarray of length exactly k.

// Return the maximum average.

// Example
// nums = [1, 12, -5, -6, 50, 3]
// k = 4

package leetcodePractise;

import java.util.Scanner;

public class maximumAverageSubarrayI {

    public static double maximumAverageSubarrayI(int nums[], int k) {

        int sum = 0;
        for(int i=0; i<k; i++) {
           sum = sum + nums[i];
        }

        int maxSum = sum;

        // sliding window
        int startIndex = 0;
        int endIndex = k;

        while(endIndex < nums.length) {

            sum -= nums[startIndex];
            startIndex++;

            sum += nums[endIndex];
            endIndex++;

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        System.out.println(maximumAverageSubarrayI(nums, k));

        sc.close();;
    }
}

