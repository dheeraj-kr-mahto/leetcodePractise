package leetcodePractise;

import java.util.Scanner;

public class reversePrefix {

    public static String reversePrefix(String word, char ch) {

        char[] arr = word.toCharArray();

        int end = -1;

        // Find first occurrence of ch
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ch) {
                end = i;
                break;
            }
        }

        // Reverse prefix
        int start = 0;

        while (start < end) {

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        char ch = sc.next().charAt(0);

        String result = reversePrefix(word, ch);

        System.out.println(result);

        sc.close();
    }
}