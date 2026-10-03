// Program to find the sum of digits of a number 

public class SumOfDigits {
    public static int sumDigits(int number) {
        int sum = 0;

        // split the digits and add;
        while(number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 1234;
        System.out.println("Sum of digits: " + sumDigits(number));
    }
}
