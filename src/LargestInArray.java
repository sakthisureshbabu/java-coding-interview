// Find the larngest element

public class LargestInArray {
    public static int findLargest(int[] array) {
        if(array.length == 1)
            return array[0];
        int MAX = array[0];
        for(int i=1; i<array.length; i++) {
            if(MAX <= array[i])
                MAX = array[i];
        }
        return MAX;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 9, 1, 5, 7};
        System.out.println("Largest element is: " + findLargest(numbers));
    }
}