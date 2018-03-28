package day0322Repeat2;

public class Question19 {
    public static void diamond(int n) {
        if (n % 2 == 0) n = n - 1;
        for (int i = 1; i <= n / 2 + 1; i++) {  //row
            for (int j = 1; j <= n; j++) {   //column
                if (j <= (n - 2 * i + 1) / 2 || j > (n + 2 * i - 1) / 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i || j > n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void printStar(int n) {
        //打印上半部分
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j < n - i)
                    System.out.print(" ");
                if (j >= n - i && j <= n + i)
                    System.out.print("*");
            }
            System.out.println();
        }
        //打印下半部分
        for (int i = 1; i < n; i++) {
            System.out.print(" ");
            for (int j = 0; j < 2 * n - i; j++) {
                if (j < i)
                    System.out.print(" ");
                if (j >= i && j < 2 * n - i - 1)
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(9);
        //printStar(5);
    }
}
