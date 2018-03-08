package test0220;

public class test3 {
    public static void main(String[] args) {
        String s="CHAINFUSION";   //OTMUZRGEUAZ
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char temp= (char) ((s.charAt(i)-65+12)%26+65);
            sb.append(temp);
        }
        System.out.println(sb.toString().toLowerCase());
    }
}
