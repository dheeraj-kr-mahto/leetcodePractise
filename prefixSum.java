// basic prefix-sum syntax.

// Result
// arr:    2   4   1   5   3
//          ↓   ↓   ↓   ↓   ↓
// prefix: 2   6   7   12  15

package leetcodePractise;

import java.util.Scanner;

public class prefixSum {

    public static int[] prefixSum(int[] nums) {

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for(int i = 1; i<nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int[] result = prefixSum(nums);

        for(int i = 0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
    
}
