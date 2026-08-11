
// Input:
// s = "anagram"
// t = "nagaram"

// Output:
// true

package leetcodePractise;
import java.util.Scanner;

public class validAnagram {

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int x: count) {
            if(x !=0 ) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();
        System.out.println(isAnagram(s, t));

           sc.close();
    }
}


