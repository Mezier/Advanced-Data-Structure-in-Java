package day0322Repeat2;

import java.util.Scanner;

public class Question14 {
    public static int sum(String s){
        int sum=0;
        String[] ss=s.split("/");
        int year=Integer.valueOf(ss[0]);
        int month=Integer.valueOf(ss[1]);
        int day=Integer.valueOf(ss[2]);
        int months[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        if(year%4==0||year%1000==0){
            months[1]=29;
        }
        for(int i=0;i<month-1;i++){
            sum+=months[i];
        }
        return sum+day;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input the date with the format of :yyyy/mm/dd");
        String s=sc.next();
        sc.close();
        System.out.println(sum(s));
    }
}
