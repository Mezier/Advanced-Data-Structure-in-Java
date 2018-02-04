package advanced;
/*主要的思想就是，为了控制执行的顺序，
必须要先持有prev锁，也就前一个线程要释放自身对象锁，
再去申请自身对象锁，两者兼备时打印，
之后首先调用self.notify()释放自身对象锁，唤醒下一个等待线程，
再调用prev.wait()释放prev对象锁，
终止当前线程，等待循环结束后再次被唤醒。
程序运行的主要过程就是A线程最先运行，持有C,A对象锁，
后释放A,C锁，唤醒B。
线程B等待A锁，再申请B锁，后打印B，
再释放B，A锁，唤醒C，线程C等待B锁，
再申请C锁，后打印C，再释放C,B锁，唤醒A。
按照前面的思考，A唤醒B，B唤醒C，C再唤醒A*/
//Thread A prints A, Thread B prints B, Thread C prints C, for 10 times, sequently
public class ThreadWait implements Runnable{
    private String name;
    private Object prev;
    private Object self;   
	public ThreadWait(String name, Object prev, Object self) {
		super();
		this.name = name;
		this.prev = prev;
		this.self = self;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count=10;
		while(count>0){
			synchronized (prev) {
			  synchronized (self) {
			    System.out.println(name);
			    count--;
			    self.notify();
			}	
			  try {
				prev.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
	 public static void main(String[] args) throws InterruptedException {
		Object a=new Object();
		Object b=new Object();
		Object c=new Object();
		ThreadWait pa=new ThreadWait("A",c,a);
		ThreadWait pb=new ThreadWait("B",a,b);
		ThreadWait pc=new ThreadWait("C",b,c);
		new Thread(pa).start();
		Thread.sleep(100);  //to make sure it could execute by sequence
		new Thread(pb).start();
		Thread.sleep(100);
		new Thread(pc).start();
		Thread.sleep(100);
	}
 
}
