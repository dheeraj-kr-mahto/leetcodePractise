package leetcodePractise;

import java.util.Scanner;

public class productOfArraySelf {
    public static int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];

        int[] right = new int[nums.length];

        left[0] = 1;
        for(int i=1; i<nums.length; i++) {
            left[i] = left[i-1] * nums[i-1];
        }

        right[nums.length - 1] = 1;
        for(int i = nums.length-2; i>-1; i--) {
            right[i] = right[i+1] * nums[i+1];
        }

        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int[] result = productExceptSelf(nums);

        for(int i = 0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
