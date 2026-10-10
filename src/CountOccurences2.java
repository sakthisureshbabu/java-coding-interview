// create a int array of 256 characters. Array values zero by default
// increment the corresponding ascii value of the occuring character

public class CountOccurences2 {
    public static void main(String[] args) {
        String str = "Programming";
        char[] words = new char[str.length()];
        int[] ascii = new int[256];

        for(char word: words) {
            ascii[word]++;
        }

        for(int i=0; i<ascii.length; i++) {
            if(ascii[i] > 0) {
                System.out.println((char)i + ": " + ascii[i]);
            }
        }
    }    
}
