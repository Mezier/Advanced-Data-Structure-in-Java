package basicAlgorithm;

public class Recursion22 {
  public static int recur(int n){
	  if(n==1){
		  return 1;
	  }else{
	  return recur(n-1)*n;}
  }
  public static int recur2(int n){
	  int s=0;
	  if(n==1){
		  return 1;
	  }else{
		  for(int i=1;i<=n;i++){
			  s=s+recur2(n-1);
		  }
	  return s;}
  }
  public static void main(String[] args) {
	System.out.println(recur2(4));
}
}
