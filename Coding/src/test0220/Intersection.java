package test0220;

import java.util.ArrayList;
import java.util.Arrays;

//Given two arrays, write a function to compute their intersection.
//  Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
public class Intersection {
    public static int[] interset(int[] nums1,int[] nums2){
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(Integer i:nums2){
            b.add(i);
        }
        for(Integer i:nums1){
            if(b.contains(i)){
                b.remove(i);
                list.add(i);
            }
        }
        int[] arrays=new int[list.size()];
        for(int i=0;i<arrays.length;i++){
            arrays[i]=list.get(i);
        }

        return arrays;
    }

    public static void main(String[] args) {
        int a[]=interset(new int[]{1,2,2},new int[]{1,2,2,3});

        System.out.println(Arrays.toString(a));
    }
}
