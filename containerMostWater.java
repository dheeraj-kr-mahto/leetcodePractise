// Problem

// You are given an integer array height where each element represents the height of a vertical line.

// Find two lines that, together with the x-axis, form a container that holds the maximum amount of water.

// Return the maximum area.

// Example 1
// Input:
// height = [1,8,6,2,5,4,8,3,7]

// Output:
// 49
package leetcodePractise;

import java.util.Scanner;

public class containerMostWater {

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]) {
                left ++;
            } else {
                right--;
            }
          
        }
          return maxArea;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println(maxArea(height));

        sc.close();
    }
}
