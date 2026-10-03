// Check if a given string is a palindrome

public class Palindrome {
    public static boolean isPalindrome(String word) {
        int i=0, j=word.length() - 1;
        while(i<j) {
            if(word.charAt(i) != word.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "malayalam";
        System.out.println(word + " is a palindrome? " + isPalindrome(word));
    }
}