
// Maximum Subarray
// Problem

// Given an integer array nums, return the largest sum of any contiguous subarray.

// Example 1
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]

// Output: 6

// Explanation:
// [4,-1,2,1] = 6

package leetcodePractise;
import java.util.Scanner;

public class maximumSubarraySum {

public static int maxSubArray(int[] nums) {
    int currSum = 0;
    int maxSum = nums[0];

    for(int i=0; i < nums.length; i++) {

        currSum += nums[i];
        if(currSum > maxSum) {
            maxSum = currSum;
        }

        if(currSum < 0) {
            currSum = 0;
        }
    }
    return maxSum;
}
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(maxSubArray(nums));

        sc.close();
    }
}

