
// LeetCode 303 — Range Sum Query - Immutable

// This is a Prefix Sum problem.

// Question

// Given an integer array nums, calculate the sum of elements between index left and right, inclusive.

// You should be able to answer range-sum queries efficiently.

// Example
// nums = [-2, 0, 3, -5, 2, -1]

// left = 0
// right = 2

// Sum:

// -2 + 0 + 3 = 1

// Output:

// 1


package leetcodePractise;

import java.util.Scanner;

public class rangeQuerySum {

    static int[] prefixSum(int[] nums) {

        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        return prefix;
    }

    static int rangeSum(int[] prefix, int left, int right) {

        if (left == 0) {
            return prefix[right];
        }

        return prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int left = sc.nextInt();
        int right = sc.nextInt();

        int[] prefix = prefixSum(nums);

        System.out.println(rangeSum(prefix, left, right));

        sc.close();
    }
}