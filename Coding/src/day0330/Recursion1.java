package day0330;

public class Recursion1 {
    public static int method1(int n){
        final int f=n;
        System.out.println(n);
        if(n<5000){
            return method1(n*2);
        }

        return n;
    }

    public static void main(String[] args) {
        method1(1237);
    }
}
