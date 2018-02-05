package basicAlgorithm;

import java.util.Arrays;

public class Reverse31 {
   private static int[] re(int[] a){
	   int[] b=new int[a.length];
	   for(int i=a.length-1;i>=0;i--){
		   b[a.length-1-i]=a[i];
	   }
	   return b;
   }
   private static void p(int[] a){
		  for(int i=0;i<a.length;i++){
			  System.out.print(a[i]+" ");
		  }
	  }
   public static void main(String[] args) {
	int[] a={2,6,5,1,9};
	p(re(a));
}
}
