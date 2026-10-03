// Find factorial of a number using recursion

public class FactorialRecursion {
    public static int factorial(int n) {
        if(n<=1)
            return n;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println("Factorial of " + number + ": " + factorial(number));
    }
}