package day0322Repeat2;

import java.util.Arrays;

public class Question35 {
    public static int[] change(int[] a){
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        for(int i=0;i<a.length;i++){
            if(a[i]==max){
                int temp=a[i];
                a[i]=a[0];
                a[0]=max;
            }
            if(a[i]==min){
                int temp=a[i];
                a[i]=a[a.length-1];
                a[a.length-1]=min;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[]=new int[]{2,5,1,3,4,6,2};
        int b[]=change(a);
        System.out.println(Arrays.toString(b));
    }
}
