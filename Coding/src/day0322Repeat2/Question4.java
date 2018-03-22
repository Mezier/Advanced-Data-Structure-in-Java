package day0322Repeat2;

public class Question4 {
    public static void printNum(int n) {
        System.out.println(n + "=");
        while (!isPrime(n)) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    n = n / i;
                    System.out.print(i + "*");
                    break;
                }
            }
        }
        System.out.println(n);
    }

    public static boolean isPrime(int n) {
        boolean f = false;
        if (n == 1 || n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                f = false;
                break;
            }
        }
        return f;
    }

    public static void method2(int n) {
        System.out.println(n + "=");
        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.print(i + "*");

            }
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNum(128);
        method2(135);
    }
}
