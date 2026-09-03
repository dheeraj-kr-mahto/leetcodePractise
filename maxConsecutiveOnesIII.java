// LeetCode 1004 — Max Consecutive Ones III
// Question

// Given a binary array nums and an integer k, you can change at most k zeros into ones.

// Find the maximum number of consecutive 1s you can get.

// Example
// nums = [1,1,1,0,0,0,1,1,1,1,0]
// k = 2

// We can change two 0s:

// [1,1,1,0,0,0,1,1,1,1,0]
//        ↑   ↑
//        change 2 zeros

// The longest possible window is:

// [0,0,1,1,1,1]

// Length = 6

package leetcodePractise;

import java.util.Scanner;

public class maxConsecutiveOnesIII {

    public static int longestOnes(int[] nums, int k) {

        int low = 0;
        int high = 0;
        int zero_Count = 0;
        int maxLen = 0;

        while (high < nums.length) {

            if (nums[high] == 0) {
                zero_Count++;
            }

            high++;

            while (zero_Count > k) {

                if (nums[low] == 0) {
                    zero_Count--;
                }

                low++;
            }

            maxLen = Math.max(maxLen, high - low);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(longestOnes(nums, k));

        sc.close();
    }
}