
// Unique Number of Occurrences

// This is a common HashMap + HashSet problem.

// Question

// Given an array, check whether the frequency (occurrence) of every number is unique.

// Example 1
// arr = [1, 2, 2, 1, 1, 3]

package leetcodePractise;

import java.util.*;

public class uniqueOccurrences {

    public static boolean uniqueOccurrences(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // Store unique frequencies
        Set<Integer> set = new HashSet<>(map.values());

        // Compare number of elements and unique frequencies
        if (map.size() == set.size()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(uniqueOccurrences(arr));

        sc.close();
    }
}


