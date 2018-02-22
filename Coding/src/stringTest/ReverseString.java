package stringTest;

public class ReverseString {
     public static String rev(String s){
         StringBuffer sb=new StringBuffer();
         for(int i=s.length()-1;i>=0;i--){
             sb.append(s.charAt(i));
         }
         return sb.toString();
     }

    public static void main(String[] args) {
        System.out.println(rev("Hello"));
    }
}
