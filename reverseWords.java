package leetcodePractise;

public class reverseWords {

   public static String reverseWords(String str) {

       String[] words = str.split(" ");
       
       StringBuilder sb = new StringBuilder();

       for(int i=words.length - 1; i>=0; i--) {
          sb.append(words[i]).append(" ");
       }
       return sb.toString().trim();
   }
    public static void main(String[] args) {
        String str = "I love Java";
    }
}

