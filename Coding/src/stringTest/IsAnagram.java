package stringTest;

import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Given two strings s and t, write a function to determine if t is an anagram of s.
//
//        For example,
//        s = "anagram", t = "nagaram", return true.
//        s = "rat", t = "car", return false.
public class IsAnagram {
    public static boolean method1(String s,String t){

        LinkedList list1=new LinkedList();
        LinkedList list2=new LinkedList();
        for(int i=0;i<s.length();i++){
            list1.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            list2.add(t.charAt(i));
        }
        Collections.sort(list1);
        Collections.sort(list2);

        if(list1.toString().equals(list2.toString())){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(method1("a","a"));
    }
}
