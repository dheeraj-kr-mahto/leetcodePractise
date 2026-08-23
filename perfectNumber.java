  // Check if a Number is Perfect

// A perfect number is a number whose proper divisors add up to the number itself.

// Example:

// 6 → 1 + 2 + 3 = 6

// So 6 is a perfect number.

package leetcodePractise;

public class perfectNumber {

    public static boolean isPerfect(int num) {

        int sum = 0;

        for(int i=1; i<num; i++) {

            if(num % i == 0) {
                sum = sum + i;
            }
        }
        return sum == num;
    }
    public static void main(String[] args) {
        
        int num = 6;
        System.out.println(isPerfect(num));
    }
}


