// Given an integer array nums and an integer k, determine whether there are two different indices i and j such that:

// nums[i] == nums[j]

// and

// |i - j| <= k

// If such a pair exists, return true. Otherwise, return false.

// Example 1
// Input:
// nums = [1,2,3,1]
// k = 3

// Output:
// true

package leetcodePractise;

import java.util.HashMap;
import java.util.Scanner;

public class containsDuplicateII {

   public static boolean containsDuplicate(int[] nums, int k) {
     
    HashMap<Integer, Integer> map = new HashMap<>();
     for(int i = 0; i<nums.length; i++) {

        if(map.containsKey(nums[i])) {
            int idx = map.get(nums[i]);

            if(i - idx <= k) {
                return true;
            }
        }
        map.put(nums[i] , i);
     }
     return false;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(containsDuplicate(nums, k));

        sc.close();
    }
}
