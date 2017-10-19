package recursion;

public class GetSumByRecursion {
	 public static int sum=0;
	 private static int getSum(int n){
		
		 if(n==1) {return 1;}
		  sum=getSum(n-1);
		  return sum+n;
	  }
   public static void main(String[] args) {
	  System.out.println(getSum(5));
}
 
}
