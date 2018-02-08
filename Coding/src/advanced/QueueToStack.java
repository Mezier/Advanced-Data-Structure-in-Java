package advanced;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueToStack {
  public static void main(String[] args) {
	
	  Queue<String> q1=new LinkedList<String>();
	 // Queue<String> q2=new LinkedList<String>();
	  q1.add("A");
	  q1.add("B");
	  q1.add("C");
	  System.out.println(q1.toString());
	  Queue<String> q2=toStack(q1);
	  System.out.println(q2);
	  
}
  public static <E> Queue<E> toStack(Queue<E> A){
	  Queue<E> q=new LinkedList<E>();
	  ArrayList<E> array=new ArrayList<E>();
	  for(E a:A){
		  array.add(a);
	  }
	  for(int i=array.size()-1;i>=0;i--){
		  q.add(array.get(i));
	  }
	  return q;
  }
}
