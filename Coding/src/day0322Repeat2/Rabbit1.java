package day0322Repeat2;
//question 1
public class Rabbit1 {
    public static int getNum(int n){
        if(n==1||n==2){
            return 1;
        }else{
            return getNum(n-1)+getNum(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(getNum(8));
    }
}
