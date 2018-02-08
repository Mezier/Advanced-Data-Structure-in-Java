package threadDemo;
//all thread execute the same code.
public class ShareData {
  private int num=10;
  public synchronized void inc(){
	  num++;
	  System.out.println(Thread.currentThread().getName()+"invoke inc method num:"+num);
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  public static void main(String[] args) {
		ShareData s=new ShareData();
		for(int i=0;i<4;i++){
			new Thread(new RunnableCusToInc(s),"Thread"+i).start();
		}
	}
}
class RunnableCusToInc implements Runnable{
   private ShareData share;
	public RunnableCusToInc(ShareData share) {
	super();
	this.share = share;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			share.inc();
		}
	}
	
}