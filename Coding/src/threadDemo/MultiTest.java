package threadDemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiTest {
  public static void main(String[] args) throws Exception, ExecutionException {
	Date date1=new Date();
	ExecutorService pool=Executors.newFixedThreadPool(3);
	List<Future> list=new ArrayList<Future>();
	for(int i=0;i<3;i++){
		Callable c=new Mycallable(i+" ");
		Future f=pool.submit(c);
		list.add(f);
	}
	pool.shutdown();
	for(Future f:list){
		System.out.println(f.get().toString());
	}
	Date dd=new Date();
	System.out.println("times end, time in total:"+(dd.getTime()-date1.getTime()));
	
}
}
class Mycallable implements Callable<Object>{
	private String taskNum;

	public Mycallable(String taskNum) {
		super();
		this.taskNum = taskNum;
	}
	public Object call() throws Exception{
		System.out.println(">>>"+taskNum+"start");
	    Date d1=new Date();
	    Thread.sleep(100);
	    Date d2=new Date();
	    long time=d2.getTime()-d1.getTime();
	    System.out.println(">>"+taskNum+"ends");
	    return taskNum+"time:"+time;
	}
}