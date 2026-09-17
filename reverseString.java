// LeetCode 344 — Reverse String
// Description

// Given a character array s, reverse the array in-place.

// You must modify the original array instead of creating another array.

// Example
// s = ['h', 'e', 'l', 'l', 'o']

// After reversing:

// ['o', 'l', 'l', 'e', 'h']


package leetcodePractise;
import java.util.*;
public class reverseString {

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while(start < end) {
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        
        char[] s = str.toCharArray();

        reverseString(s);

        System.out.println(s);
        sc.close();
    }
}
