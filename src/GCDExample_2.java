public class GCDExample_2 {
    public static int getGCD(int a, int b) {
        int temp;
        while(b!=0) {
            temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int num_1 = 56, num_2 = 98;
        System.out.println("GCD of " + num_1 + " and " + num_2 + " = " + getGCD(num_1, num_2));
    }
}
