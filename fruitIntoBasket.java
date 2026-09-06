package leetcodePractise;

import java.util.HashMap;
import java.util.Scanner;

public class fruitIntoBasket {

    public static int totalFruit(int[] fruits) {

        HashMap<Integer,Integer> basket = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxFruits = 0;

        for(right = 0; right<fruits.length; right++) {
             // add current to basket
             basket.put(fruits[right], basket.getOrDefault(fruits[right],0) + 1);

             // if basket has more than two types  of basket

             while(basket.size() > 2) {
                int fruitCount = basket.get(fruits[left]);
                if(fruitCount == 1) 
                    basket.remove(left);
              else 
                basket.put(fruits[left], fruitCount - 1);
                left++;
             }

             maxFruits = Math.max(maxFruits, right - left + 1);
        
    }
        return maxFruits;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] fruits = new int[n];

        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextInt();
        }

        System.out.println(totalFruit(fruits));

        sc.close();
    }
}
