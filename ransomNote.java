
// Given two strings:

// ransomNote
// magazine

// Return true if you can construct ransomNote using the letters from magazine.

// Each letter in magazine can be used only once.

// Example 1
// Input:
// ransomNote = "a"
// magazine = "b"

// Output:
// false
package leetcodePractise;
import java.util.Scanner;

public class ransomNote {

public static boolean canConstruct(String ransomNote, String magazine) {

    int[] count = new int[26];

    for(char ch: magazine.toCharArray()) {
        count[ch - 'a']++;
    }

    for(char ch: ransomNote.toCharArray()) {
        count[ch - 'a']--;

        if(count[ch - 'a'] < 0) {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter ransom note: ");
        String ransomNote = sc.nextLine();

        System.out.print("Enter magazine: ");
        String magazine = sc.nextLine();

        System.out.println(canConstruct(ransomNote, magazine));

        sc.close();
    }
}