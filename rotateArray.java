// LeetCode 189 — Rotate Array
// Description

// Given an integer array nums, rotate the array to the right by k steps.

// Example:

// nums = [1, 2, 3, 4, 5, 6, 7]
// k = 3

// After rotating right 3 times:

// [5, 6, 7, 1, 2, 3, 4]
package leetcodePractise;

import java.util.Scanner;

public class rotateArray {

    static void reverse(int[] nums, int st, int end) {

        while (st < end) {

            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;

            st++;
            end--;
        }
    }

    static void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        // Reverse complete array
        reverse(nums, 0, n - 1);

        // Reverse first k elements
        reverse(nums, 0, k - 1);

        // Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        rotate(nums, k);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}