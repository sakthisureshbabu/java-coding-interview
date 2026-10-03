// Check if a number is prime

import java.lang.Math;

public class checkPrime {
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for(int i=2; i<=Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 29;
        System.out.println(number + " is prime? " + isPrime(number));
    }
}