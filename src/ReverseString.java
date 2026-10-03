// Reverse string without using StringBuildeer or reverse()

public class ReverseString {
    // it is not possible to replace the character in string without stringBuilder
    // so the approach is slice and insert the character

    public static String reverseString(String str) {
        int str_len = str.length();
        String reversed = "";
        if(str_len > 1) {
            for(int i=0; i<str_len; i++) {
                reversed += str.charAt(str_len-i-1);
            }
        }
        return reversed;
    }

    public static void main(String[] args) {
        String input = "Hello";
        System.out.println("The reverse of " + input + " is: " + reverseString(input));
    }
}