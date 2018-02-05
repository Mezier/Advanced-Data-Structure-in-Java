package basicAlgorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort30 {
  private static int[] sort(int[] a){
	  int[] s=a;
	  
	  for(int i=0;i<s.length-1;i++){
		  for(int j=i+1;j<s.length;j++){
			 if(a[j]<a[i]){
				 int temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }
		  }
	  }
	  return s;
  }
  private static void p(int[] a){
	  for(int i=0;i<a.length;i++){
		  System.out.print(a[i]+" ");
	  }
  }
  private static int[] insert(int a, int[] A){
	  int []B=new int[A.length+1];
	  for(int i=A.length-1;i>0;i--){
		  if(a>A[i]){
			  	B[i+1] = a; 
		  for(int j=0;j<=i;j++)
		      B[j] = A[j];
		      for(int k=i+2;k<B.length;k++)
		        B[k] = A[k-1];
		      break;
		  }
	  }
	  return B;
  }
  public static void main(String[] args) {
	  int[] A = new int[]{10,8,7,6,4,1,2,8,8,3,12};
		int[] B = sort(A);
		p(B);
		System.out.println(" ");
		B=insert(11,B);
		p(B);

}
}
