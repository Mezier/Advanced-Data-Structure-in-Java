package day0322Repeat2;

public class Question21 {
    public static int multi(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum=sum*i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=5;i++){
            sum+=multi(i);
        }
        System.out.println(sum);
    }
}
