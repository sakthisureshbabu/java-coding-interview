// Store occurences using HashMap

import java.util.Map;
import java.util.HashMap;

public class CountOccurences3 {
    public static void main(String[] args) {
        String str = "Programming";
        Map<Character, Integer> countMap = new HashMap<>();

        for(char c: str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0)+1);
        }
        System.out.println(countMap);

        for(Map.Entry<Character, Integer> entry: countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
