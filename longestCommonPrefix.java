// LeetCode 14: Longest Common Prefix
// Problem

// Write a function to find the longest common prefix among an array of strings.

// If there is no common prefix, return an empty string "".

// Example 1
// Input:
// strs = ["flower","flow","flight"]

// Output:
// "fl"

package leetcodePractise;
import java.util.Scanner;

public class longestCommonPrefix {
    
    public static String longestCommonPrefix(String[] strs) {
       
        StringBuilder result = new StringBuilder();
        
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for(int i=0; i<first.length; i++) {
            if(first[i] != last[i]) {
                break;
            }
            result.append(i);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        System.out.println(longestCommonPrefix(strs));

        sc.close();
    }
}


