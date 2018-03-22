package day0322Repeat2;

public class Question6 {
    public static int maxMulti(int a, int b) {
        int result = 0;
        int min = a > b ? b : a;
        int max = a > b ? a : b;
        for (int i = min; i > 0; i--) {
            if (min % i == 0 && max % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int minDiv(int a, int b) {
        int result = 0;
        int min = a > b ? b : a;
        int max = a > b ? a : b;
        for (int i = max; i <= min * max; i++) {
            if (i % min == 0 && i % max == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxMulti(12, 16));
        System.out.println(minDiv(12, 16));

    }
}
