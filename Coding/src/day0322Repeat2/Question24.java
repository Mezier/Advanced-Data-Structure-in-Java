package day0322Repeat2;

public class Question24 {
    public static void main(String[] args) {
        int x=3234;
        StringBuffer sb=new StringBuffer(Integer.toString(x));
        for(int i=sb.length()-1;i>=0;i--){
            System.out.print(sb.charAt(i));
        }
        System.out.println("size:"+sb.length());
    }
}
