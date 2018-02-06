package basicAlgorithm;

import java.util.Arrays;

public class Trasfer48 {
  private static int trans(int n){
	  int s=0;
	  if(n>=1000&&n<=9999){
		int a[]=new int[]{n/1000,(n/100)%10,(n/10)%10,n%10};
		  for(int x=0;x<4;x++){
			  a[x]=(a[x]+5)%10;
		  }
		  int tem=a[0];
		  a[0]=a[3];
		  a[3]=tem;
		  tem=a[1];
		  a[1]=a[2];
		  a[2]=tem;
		  StringBuffer sb=new StringBuffer();
		  for(int i=0;i<4;i++){
			  sb.append(a[i]);
		  }
		  s=Integer.valueOf(sb.toString());
	  }
	  return s;
  }
  public static void main(String[] args) {
	System.out.println(trans(3241));
}
}
