package stringTest;

//Given a string, find the first non-repeating character in it and return it's index.
// If it doesn't exist, return -1.
public class firstUniChar {
    public static int firstUniqChar(String s) {
        int x = -1;
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<s.length();i++){
            char cc=s.charAt(i);
            sb.replace(i,i+1,"");
            if(!sb.toString().contains(Character.toString(cc))){
                x=i;
                break;
            }


        }

        return x;
    }
    public static int method2(String s){
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(firstUniqChar("lleetwde"));
    }
}
