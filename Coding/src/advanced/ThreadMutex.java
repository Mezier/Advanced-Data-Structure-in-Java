package advanced;
/*subthread execute 5 times 
and then main thread run 2 times,
for 3 times in total*/
public class ThreadMutex {
private boolean subFlag=true;
public synchronized void mainMethod(){
	while(subFlag){
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	for(int i=1;i<4;i++){
		System.out.println(Thread.currentThread().getName()+"main thread running loop=="+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	subFlag=true;
	notify();
}
public synchronized void subMethod(){
	while(!subFlag){
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	for(int i=1;i<6;i++){
		System.out.println(Thread.currentThread().getName()+"sub thread running loop=="+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	subFlag=false;
	notify();
}
  public static void main(String[] args) {
	ThreadMutex test=new ThreadMutex();
	// sub thread
	new Thread(new Runnable(){
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<3;i++){
				test.subMethod();
			}
		}		
	}).start();
	//main thread;
	for(int i=0;i<2;i++){
		test.mainMethod();
	}
}
}
