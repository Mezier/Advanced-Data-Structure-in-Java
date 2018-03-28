package day0322Repeat2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question34 {
    public static void so(int a,int b,int c){
        List<Integer> list= Arrays.asList(a,b,c);
        Collections.sort(list,(Integer x,Integer y)->{return y-x;});
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        for(int i=0;i<3;i++){
            System.out.println("pleaser input the "+i+"num");
             a[i]=sc.nextInt();
        }
        sc.close();
        so(a[0],a[1],a[2]);
    }
}
