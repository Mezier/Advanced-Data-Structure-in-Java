package day0330;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void count(String s){
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            Integer num=map.get(c);
            if(num==null){
                num=1;
            }else{
                num+=1;
            }
            map.put(c,num);
        }
        for(Character m:map.keySet()){
            System.out.println(m+": "+map.get(m));
        }
    }

    public static void main(String[] args) {
        count("I am Chinese");
    }
}
