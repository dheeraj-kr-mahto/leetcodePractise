
// LeetCode 560 — Subarray Sum Equals K
// Question

// Given an integer array nums and an integer k, return the total number of continuous subarrays whose sum equals k.

// Example:

// nums = [1, 2, 3]
// k = 3

// Subarrays with sum 3:

// [1, 2]
// [3]

// Answer: 2

package leetcodePractise;

import java.util.HashMap;
import java.util.Scanner;

public class subarraySumEqualK {

    public static int subArraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int result = 0;
        int prefixSum = 0;

        for(int num: nums) {
           prefixSum += num;

           if(map.containsKey(prefixSum - k)) {
              result += map.get(prefixSum - k);
           }

           map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return result;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(subArraySum(nums, k));
    }
}
