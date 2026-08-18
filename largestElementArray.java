package leetcodePractise;

public class largestElementArray {

    static int findLargest(int[] arr) {

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};

        System.out.println(findLargest(arr));
    }
}