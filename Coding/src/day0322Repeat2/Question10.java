package day0322Repeat2;

public class Question10 {
    public static double height(double h,int time){
        double distance=0;
        while(time>0){
            distance+=h;
            h=h/2;
            distance+=h;
            time--;
        }
        System.out.println(h);
        return distance;
    }

    public static void main(String[] args) {
        System.out.println(height(100,10));
    }
}
