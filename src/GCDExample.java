// GCD of two numbers using the Euclidean algorithm

public class GCDExample {
    public static int getGCD(int a, int b) {
        if(b == 0)
            return a;

        return getGCD(b, a%b);
    }

    public static void main(String[] args) {
        int num_1 = 56, num_2 = 98;
        System.out.println("The GCD of " + num_1 + " and " + num_2 + " is = " + getGCD(num_1, num_2));
    }
}
