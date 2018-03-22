package day0322Repeat2;

import java.util.LinkedList;
import java.util.List;

public class Question2 {
    public static int judgeNum(int a,int b){
        List<Integer> list=new LinkedList<>();
        for(int i=a;i<=b;i++){
            boolean f=true;
            for(int x=2;x<i;x++){
                if(i%x==0){
                    f=false;
                    break;
                }
            }
            if(f) {
                System.out.println(i);
                list.add(i);
            }
        }

        return list.size();
    }

    public static void main(String[] args) {
        System.out.println(judgeNum(101,200));
    }
}
