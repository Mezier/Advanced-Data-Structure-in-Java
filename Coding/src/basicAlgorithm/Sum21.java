package basicAlgorithm;
// the sum of 1+2!+3!+...+20!µÄºÍ
public class Sum21 {
  public static int sumMul(int n){
	  int sum=0;
	  for(int i=1;i<=n;i++){
		  int s=1;
		  for (int j=1;j<=i;j++){
			  s=j*s;
			  if(j==i){
				  sum+=s;
			  }
		  }
	  }
	  return sum;
  }
  public static void main(String[] args) {
	  
	System.out.println(sumMul(4));
}
}
