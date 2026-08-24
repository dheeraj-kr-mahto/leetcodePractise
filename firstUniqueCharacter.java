// Question: First Unique Character in a String

// Description:
// Given a string s, find the first character that appears only once in the string and return its index.

// If there is no unique character, return -1.

// Example 1
// Input:  "leetcode"
// Output: 0

package leetcodePractise;

import java.util.HashMap;

public class firstUniqueCharacter {

    public static int firstUniqueCharacter(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch,map.get(ch) + 1);
            } else {
                 map.put(ch, 1);
            }
        }

        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(map.get(ch) == 1) {
                return  i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
         String s = "leetcode";

        System.out.println(firstUniqueCharacter(s));
    }
}

