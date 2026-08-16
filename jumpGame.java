package leetcodePractise;

public class jumpGame {

    public static boolean jumpGame(int[] nums) {
      
        int finalPosition = nums.length - 1;

        for(int idx = nums.length-2; idx >= 0; idx--) {

            if(idx + nums[idx] >= finalPosition) {
                finalPosition = idx;
            }
        }

        return finalPosition == 0;
    }
    public static void main(String[] args) {
         int[] nums = {2, 3, 1, 1, 4};

    boolean ans = jumpGame(nums);

    System.out.println(ans);
    }
}

