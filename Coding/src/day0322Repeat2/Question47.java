package day0322Repeat2;

import java.util.Scanner;

public class Question47 {
    public static void print(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int time=4;
        int num[]=new int[time];
        for(int i=0;i<time;i++){
            num[i]=Integer.valueOf(sc.next());
        }
        for(int i=0;i<num.length;i++){
           print(num[i]);
        }
    }
}
