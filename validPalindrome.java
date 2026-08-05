package leetcodePractise;

import java.util.Scanner;

public class validPalindrome {
    public static boolean validPalindrom(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            else {
                return false;
            }

        }
         return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        if(validPalindrom(s)) {
            System.out.println("Palindrome:");
        } else {
            System.out.println("Not Palindrome:");
        }

    }
}
