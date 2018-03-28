package day0322Repeat2;

import java.util.Arrays;

public class Question48 {
    public static int[] encode(int n){
        int result=n;
        int array[]=new int[]{n/1000,(n/100)%10,(n/10)%10,n%10};
        for(int i=0;i<array.length;i++){

            array[i]=(array[i]+5)%10;
           // System.out.println(array[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a=encode(2367);
        System.out.println(Arrays.toString(a));
    }
}
