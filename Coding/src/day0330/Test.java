package day0330;

public class Test {
    public static void main(String[] args) {
        System.out.println(test(2));
    }
    public static int test(int x){

        try{
            return x;
        }finally {
            System.out.println("finally");
        }
    }
}
