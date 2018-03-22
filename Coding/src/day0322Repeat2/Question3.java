package day0322Repeat2;

public class Question3 {
    public static void flowerNum() {
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;  // unit
            int b = (i / 10) % 10;  //ten
            int c = i / 100;   //hundred
            if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        flowerNum();
    }
}
