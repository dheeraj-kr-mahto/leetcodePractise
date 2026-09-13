// LeetCode 26 — Remove Duplicates from Sorted Array
// Description

// Given a sorted integer array, remove the duplicate elements in-place so that each element appears only once.

// Return the number of unique elements.

// The first k positions of the array should contain the unique elements.

// Example
// nums = [1, 1, 2, 2, 3, 4, 4]

// After removing duplicates:

// [1, 2, 3, 4, ...]


package leetcodePractise;

import java.util.Scanner;

public class removeDuplicates {

    public static int removeDuplicate(int[] nums) {

        int j = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicate(nums);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}