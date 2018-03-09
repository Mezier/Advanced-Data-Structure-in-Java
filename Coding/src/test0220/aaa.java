package test0220;

import java.util.*;
import java.util.Map.Entry;

public class aaa {
    public static void main(String[] args) {
        List<Entry<String,Integer>> list=new ArrayList<Entry<String,Integer>>();
        //TreeMap<String,Integer> map=new TreeMap<String,Integer>();
        Map.Entry<String,Integer> a=new AbstractMap.SimpleEntry<String,Integer>("g",2);
        list.add(a);
        Map.Entry<String,Integer> a2=new AbstractMap.SimpleEntry<String,Integer>("z",7);
        list.add(a2);
        Map.Entry<String,Integer> a3=new AbstractMap.SimpleEntry<String,Integer>("x",15);
        list.add(a3);
        Map.Entry<String,Integer> a4=new AbstractMap.SimpleEntry<String,Integer>("b",1);
        list.add(a4);
        Map.Entry<String,Integer> a5=new AbstractMap.SimpleEntry<String,Integer>("y",6);
        list.add(a5);
        Map.Entry<String,Integer> a6=new AbstractMap.SimpleEntry<String,Integer>("c",12);
        list.add(a6);

        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });




        for (int i=list.size()-1;i>=0;i--) {
           System.out.println(list.get(i).getKey() + " - " + list.get(i).getValue());

        }

    }

}
