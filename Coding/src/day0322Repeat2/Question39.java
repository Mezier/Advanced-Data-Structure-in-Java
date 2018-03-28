package day0322Repeat2;

public class Question39 {
    public static double cal(int n){
        double result=0;
        if(n%2==0){
           return even(n);
        }else{
            return odd(n);
        }
    }
    public static double even(int a){
        double result=0;
        for(int i=2;i<=a;i=i+2){
            result+=1.0/i;
        }
        return result;
    }
    public static double odd(int a){
        double result=0;
        for(int i=1;i<=a;i=i+2){
            result+=1.0/i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(cal(10));
    }
}
