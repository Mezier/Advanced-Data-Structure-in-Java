package day0322Repeat2;

public class Question23 {
    public static int age(int n){
        int result=0;
        if(n==1){
            result=10;
        }
        return age(n-1)+2;
    }

    public static void main(String[] args) {
        System.out.println(age(5));
    }
}
