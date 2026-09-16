// LeetCode 15 — 3Sum
// Description

// Given an integer array nums, find all unique triplets [nums[i], nums[j], nums[k]] such that:

// nums[i] + nums[j] + nums[k] = 0

// The same triplet should not be repeated.

// Example
// nums = [-1, 0, 1, 2, -1, -4]

// Valid triplets:

// [-1, -1, 2]
// [-1, 0, 1]

// Output:

// [[-1, -1, 2], [-1, 0, 1]]
package leetcodePractise;

import java.util.*;

public class _3sum {

    public static List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        // Sort the array
        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(
                        Arrays.asList(nums[i], nums[left], nums[right])
                    );

                    left++;
                    right--;

                } else if (sum < 0) {

                    left++;

                } else {

                    right--;
                }
            }
        }

        return new ArrayList<>(result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = threeSum(nums);

        System.out.println(result);

        sc.close();
    }
}