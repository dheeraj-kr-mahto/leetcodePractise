// n
// array elements
// target

// 6
// 2 3 1 2 4 3
// 7

package leetcodePractise;

import java.util.Scanner;

public class minimumSizeSubarraySum {

    public static int minSubarraySum(int[] nums, int target) {

         int minLenWindow = Integer.MAX_VALUE;
         int currSum = 0;

         int low = 0;
         int high = 0;

         while (high < nums.length) {
            
            currSum += nums[high];
            high++;


            while(currSum >= target) {

                int currWindow = high - low;
                minLenWindow = Math.min(minLenWindow, currWindow);

                currSum -= nums[low];
                low++;
            }
         }

         return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(minSubarraySum(nums, target));

        sc.close();

    }
}

