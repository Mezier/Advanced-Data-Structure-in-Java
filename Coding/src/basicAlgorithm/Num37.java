package basicAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Num37 {
   private static void s(Queue<Integer> n,int k){
	   while(n.size()>1){
		   for(int i=1;i<k;i++){
			   n.add(n.remove());
		   }
		   int c=n.remove();
		   System.out.println(c+"is out");
	   }
	   System.out.println(n.toString());
   }
   public static void main(String[] args) {
	Queue<Integer> a=new LinkedList<Integer>();
	for(int i=1;i<10;i++){
		a.add(i);
	}
	s(a,3);
	
}
}
