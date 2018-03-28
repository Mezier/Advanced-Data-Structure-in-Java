package day0322Repeat2;

public class Question42 {
    public static int getRes(){
        int result=0;
        for(int i=10;i<100;i++){
            if(809*i==800*i+9*i+1){
                result=i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int r=getRes();
        if(r==0){
            System.out.println("no such result");
        }else {
            System.out.println(getRes());
        }

    }
}
