
package leetcodePractise;

import java.util.*;
public class reverseArray {
    public static int[] reverseArray(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};

        System.out.println(Arrays.toString(reverseArray(nums)));
    }
}
 

