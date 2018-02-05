package basicAlgorithm;

import java.util.Arrays;

public class Array35 {
   private static int[] so(int[] a){
	   int[] b=Arrays.copyOf(a, a.length);
	   Arrays.sort(a);
	 
	   for(int i=0;i<a.length;i++){
		   if(b[i]==a[a.length-1]){
			   
			   b[i]=b[0];
			   b[0]=a[a.length-1];
			   break;
		   }
		
	   }
	   for(int i=0;i<a.length;i++){
		  
		   if(b[i]==a[0]){
		    	
		    	  b[i]=b[a.length-1];
		    	  b[a.length-1]=a[0];
		    	  break;
		      }
	   }
	   return b;
   }
   public static void main(String[] args) {
	int[] a={3,6,0,8,1,9};
	int[] b=so(a);
	//System.out.println(Arrays.toString(a));

	
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	
}
   
}
