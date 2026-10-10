public class CountOccurences {
    public static void main(String[] args) {
        String str = "Programming";
        char[] words = str.toCharArray();
        boolean[] status = new boolean[words.length]; // false by default

        for(int i=0; i<words.length-1; i++) {
            if(status[i])
                continue; // skip the step if the character is counted;

            int count = 1;
            for(int j=i+1; j<words.length; j++) {
                if(words[i] == words[j]) {
                    count++;
                    status[j] = true;
                }
            }
            System.out.println(words[i] + ": " + count);
        }
    }
}