package day0322Repeat2;

import java.util.Map;

public class Question44 {
    public static void add(int n){
        if(n%2==0){
            for(int i=2;i<=n/2;i++){

                    if(su(i)&&su(n-i)){
                        System.out.println(n+"="+i+"+"+(n-i));
                    }

            }
        }else{
            System.out.println("it's not even number");
        }
    }
    public static boolean su(int n){
        boolean f=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                f=false;
                break;

            }
        }
        return f;
    }
    public static void main(String[] args) {

        add(10);
    }
}
