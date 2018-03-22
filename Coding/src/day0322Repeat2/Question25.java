package day0322Repeat2;

public class Question25 {
    public static boolean huiwen(int n){
        boolean f=false;
        StringBuffer sb=new StringBuffer(Integer.toString(n));
        for(int i=0;i<sb.length()/2;i++){
            if(sb.charAt(i)==sb.charAt(sb.length()-1-i)){
                f=true;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        int x=234432;
        System.out.println(huiwen(x));
    }
}
