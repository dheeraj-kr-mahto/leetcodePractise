

    // Array: 1 2 2 3 4 4 5

// After removing duplicates:
// 1 2 3 4 5

package leetcodePractise;
import java.util.*;

public class removeDuplicate {

    public static int[] removeDulicate(int[] nums) {

        HashSet<Integer> set =  new HashSet<>();
        
        for(int i = 0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        int[] result = new int[set.size()];
        int index = 0;
       
        for(int num: set) {
            result[index] = num;
            index++;
        }
        return result;
}
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,4,5};

        System.out.println(
            Arrays.toString(removeDulicate(nums))
        );
    }
}

