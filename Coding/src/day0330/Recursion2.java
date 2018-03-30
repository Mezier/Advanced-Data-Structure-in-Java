package day0330;

public class Recursion2 {
    public static int age(int n){
        //int year=0;
        if(n==1){
            return 10;
        }else{
            return age(n-1)+2;
        }

    }

    public static void main(String[] args) {
        System.out.println(age(3));
    }
}
