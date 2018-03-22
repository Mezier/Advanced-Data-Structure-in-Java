package day0322Repeat2;

public class Question20 {
    public static int getNum(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return getNum(n - 1) + getNum(n - 2);
        }
    }

    public static void main(String[] args) {
        double x = 0;
        for (int i = 1; i <= 3; i++) {
            double y=(double) getNum(i + 1) / getNum(i);
            x = x + y;
        }
        System.out.println(x);
    }
}
