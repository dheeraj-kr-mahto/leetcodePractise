
// Input: nums = [1,2,3,4]

// Output: false
package leetcodePractise;

import java.util.HashSet;
import java.util.Scanner;

public class containsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size a array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array Elements: ");

        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

         if (containsDuplicate(nums)) {
            System.out.println("Contains Duplicate");
        } else {
            System.out.println("No Duplicate");
        }

        sc.close();
    }
}
