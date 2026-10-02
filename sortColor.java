//  Sort Colors

// Given an integer array nums containing only three possible values:

// 0, 1, 2

// Sort the array in-place so that all 0s come first, followed by all 1s, and then all 2s.

// Example
// nums = [2, 0, 2, 1, 1, 0]

// After sorting:

// [0, 0, 1, 1, 2, 2]

package leetcodePractise;

import java.util.Scanner;

public class sortColor {

    public static void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                // Swap low and mid
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                // Swap mid and high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;

                // Don't increment mid
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sortColors(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
