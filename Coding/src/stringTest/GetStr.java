package stringTest;
//Return the index of the first occurrence of needle in haystack,
// or -1 if needle is not part of haystack.
public class GetStr {
    public static int strStr(String haystack, String needle) {
      int x=-1;
      if(haystack.length()==needle.length()){
          if(haystack.equals(needle)){
              x=0;
          }
      }else if(haystack.length()>needle.length()){
      for(int i=0;i<=haystack.length()-needle.length();i++){
          if(needle.equals(haystack.substring(i,i+needle.length()))){
              x=i;
              break;
          }
      }}
      return x;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi","pi"));
    }
}
