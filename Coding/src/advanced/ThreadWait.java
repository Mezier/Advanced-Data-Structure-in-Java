package advanced;
/*��Ҫ��˼����ǣ�Ϊ�˿���ִ�е�˳��
����Ҫ�ȳ���prev����Ҳ��ǰһ���߳�Ҫ�ͷ������������
��ȥ������������������߼汸ʱ��ӡ��
֮�����ȵ���self.notify()�ͷ������������������һ���ȴ��̣߳�
�ٵ���prev.wait()�ͷ�prev��������
��ֹ��ǰ�̣߳��ȴ�ѭ���������ٴα����ѡ�
�������е���Ҫ���̾���A�߳��������У�����C,A��������
���ͷ�A,C��������B��
�߳�B�ȴ�A����������B�������ӡB��
���ͷ�B��A��������C���߳�C�ȴ�B����
������C�������ӡC�����ͷ�C,B��������A��
����ǰ���˼����A����B��B����C��C�ٻ���A*/
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
