package test0220;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class test2 {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("p", 3);
        map.put("b", 5);
        map.put("c", 1);
        Set<String> sets = new HashSet();
        sets.add("a");
        sets.add("b");
        sets.add("c");
        sets.add("a");
        sets.add("b");
        sets.add("c");

        for (String s : sets) {
            System.out.println(s);

        }
        System.out.println(sets.size());

    }

}
