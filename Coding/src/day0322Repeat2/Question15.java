package day0322Repeat2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question15 {
    public static void sort(int a, int b, int c) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
        Collections.sort(list,(Integer x,Integer y)->{ return y-x;});
        System.out.println(list.toString());

    }

    public static void main(String[] args) {
        sort(3, 7, 5);
    }
}
