package stringTest;

//Write a function to find the longest common prefix string amongst an array of strings.
public class LongestPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String s = "";
        if (strs.length == 0) {
            return "";
        }
        s=strs[0];
        for (int i=1;i<strs.length;i++){
            while (strs[i].indexOf(s)!=0){
                s=s.substring(0,s.length()-1);
                if(s.isEmpty()){
                    return "";
                }
            }
        }
        return s;
    }
    public static String method1(String strs[]){
        if(strs.length==0) return "";
        String s=strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(s)!=0){
                s=s.substring(0,s.length()-1);
            }
            if(s.isEmpty()){
                return "";
            }
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(method1(new String[]{"abc","abcyu"}));
    }

}
