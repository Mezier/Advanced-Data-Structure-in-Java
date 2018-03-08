package test0220;

import java.util.Set;

public class test2 {
    static Integer a=new Integer(0);
    public void sum(){
        a+=1;
    }
    public static void main(String[] args) {
test2 t=new test2();
        for(int i=0;i<5;i++){
            t.sum();
        }
        System.out.println(a);
        System.out.println((int)'A');
    }

}
