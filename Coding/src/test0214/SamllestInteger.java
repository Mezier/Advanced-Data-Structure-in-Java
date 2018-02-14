package test0214;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.
public class SamllestInteger {
    public static int smallest(int[] a){ 
        int x=1;
        List<Integer> list= new ArrayList<>();
        for(Integer i:a){
            list.add(i);
        }
        Collections.sort(list);

        while(list.contains(x)){
            x++;
        }
        return x;
    }

    public static void main(String[] args) {
        int a[]=new int[]{4};
        System.out.println(smallest(a));

    }
}
