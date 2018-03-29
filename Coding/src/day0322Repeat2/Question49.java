package day0322Repeat2;

public class Question49 {
    public static int times(String s,String sub){
        int n=0;
        for(int i=0;i<=s.length()-sub.length();i++){
            if(sub.equals(s.substring(i,i+sub.length())))
            n++;
        }

        return n;
    }
    public static int word(String s){
        int x=0;
        String[] sub=s.split(" ");
        x=sub.length;
        return x;
    }
    public static void main(String[] args) {
        System.out.println(times("what are you doing? are are","are"));
        String str = "I come from County DingYuan Province AnHui.";
        System.out.println(word(str));

    }
}
