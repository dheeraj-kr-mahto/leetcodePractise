// Example:  7
// 1 2 3 2 4 1 5
// 1 → 2
// 2 → 2
// 3 → 1
// 4 → 1
// 5 → 1

// 3, 4, 5

// 3 + 4 + 5 = 12
package leetcodePractise;

import java.util.HashMap;
import java.util.Scanner;

public class uniqueElement {

    public static int uniqueElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequency
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int sum = 0;
        // Add elements that appear only once  

        for(int i=0; i<nums.length; i++) {

            if(map.get(nums[i]) == 1) {
                sum = sum + nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(uniqueElement(arr));

        sc.close();
    }
}
