package day0322Repeat2;

public class Question8 {
    public static int sum(int a,int b){
        int sum=0;
        String s=Integer.toString(a);
        for(int i=1;i<=b;i++){
            System.out.println(s);
            int n=Integer.valueOf(s);
            sum+=n;
            s=s.concat(Integer.toString(a));
        }

        return sum;
    }
    public static int method2(int a,int b){
        int sum=0;
        int sub=0;
        for(int i=0;i<b;i++){
            sub=sub*10+a;
            sum+=sub;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,4));
        System.out.println(method2(2,4));
    }
}
