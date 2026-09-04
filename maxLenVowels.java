// Input
// abciiidef
// 3
// Output
// 3
package leetcodePractise;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class maxLenVowels {

    public static int maxVowels(String s, int k) {

        int maxVowels = 0;
        int windowVowels = 0;

        Set<Character> vowels = new HashSet<>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        // First window
        for (int i = 0; i < k; i++) {

            if (vowels.contains(s.charAt(i))) {
                windowVowels++;
            }
        }

        maxVowels = windowVowels;

        // Sliding window
        for (int i = k; i < s.length(); i++) {

            // Add new character
            if (vowels.contains(s.charAt(i))) {
                windowVowels++;
            }

            // Remove old character
            if (vowels.contains(s.charAt(i - k))) {
                windowVowels--;
            }

            maxVowels = Math.max(maxVowels, windowVowels);
        }

        return maxVowels;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int k = sc.nextInt();

        int result = maxVowels(s, k);

        System.out.println(result);

        sc.close();
    }
}