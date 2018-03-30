package day0330;

public class ThreadTest implements Runnable {
    public int count=3;
    private static int task=0;
    final int id=task++;
    public ThreadTest(){}
    public ThreadTest(int count){
        this.count=count;
    }
    public String status(){
        return "#"+id+":"+(count>0?count:"off");
    }
    @Override
    public void run() {
        while(count-->0){
            System.out.println(status());
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            new Thread(new ThreadTest()).start();
        }
        System.out.println("end");
    }
}
