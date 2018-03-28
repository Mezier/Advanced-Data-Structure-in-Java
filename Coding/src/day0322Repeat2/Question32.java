package day0322Repeat2;



public class Question32 {
    public static int getNum(double a){
        int num=0;
        if(a>999999){
            String s=Double.toString(a);
            StringBuffer sb=new StringBuffer();
            for(int i=s.length()-4;i>s.length()-8;i--){
                sb.append(s.charAt(i));
            }
            num=Integer.valueOf(sb.toString());
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(getNum(12345678));
    }
}
