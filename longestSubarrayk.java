// Variable Sliding Window — Description

// This template is used to find the longest subarray whose sum is greater than or equal to target.

// What the code does

// Given:

// arr = [2, 3, 1, 2, 4, 3]
// target = 7

// It finds the maximum-length continuous subarray whose sum is >= 7.

package leetcodePractise;

import java.util.Scanner;

public class longestSubarrayk {

    public static int longestSum(int[] nums, int target) {
        int low =0;
        int high = 0;

        int currSum = 0;
        int ans = 0;

        while (high < nums.length) {
            
            currSum =currSum + nums[high];
            high++;


            while(currSum >= target) {
                int windowLen = high - low;

                ans = Math.max(ans, windowLen);

                currSum = currSum - nums[low];
                low++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int result = longestSum(arr, target);

        System.out.println(result);

        sc.close();
    }
}
