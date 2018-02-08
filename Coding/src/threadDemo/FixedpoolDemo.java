package threadDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedpoolDemo {
   public static void main(String[] args) {
	//ExecutorService pool=Executors.newFixedThreadPool(2);
	ExecutorService pool=Executors.newCachedThreadPool();

	for(int i=0;i<5;i++){
    	pool.execute(new MyThread());
    }
    pool.shutdown();
   }
}
class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
}