public class ReverseWords {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        for(int i=words.length-1; i>=0; i--)
            reversed.append(words[i]).append(" ");

        // The reversed is instance of StringBuilder not String. The return type of the function is String
        // So convert the stringBuilder into String
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "Java is fun";
        System.out.println("Reversed Sentence: " + reverseWords(sentence));
    }
}