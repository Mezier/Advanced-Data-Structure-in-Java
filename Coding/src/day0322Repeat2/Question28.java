package day0322Repeat2;

import java.util.*;

public class Question28 {
    public static void method1(int[] array){
        List list= new ArrayList();
        for(int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        int[] array=new int[]{5,4,32,10,23,0,2,9};
         method2(array);

    }
    public static void method2(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
