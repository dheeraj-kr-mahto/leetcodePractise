
// Problem

// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number, also sorted in non-decreasing order.

// Example 1
// Input: nums = [-4,-1,0,3,10]

// Output: [0,1,9,16,100]

package leetcodePractise;
public class squareSortedArray {

    public static int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            nums[i] =  nums[i] * nums[i];
        }


        int head = 0;
        int tail = nums.length - 1;

        for(int pos = nums.length - 1; pos >= 0; pos--) {

            if(nums[head] > nums[tail]) {
                result[pos] = nums[head];
                    head++;
            
        } else {
            result[pos] = nums[tail];
            tail--;
        }
    }
    return result;
}  

}