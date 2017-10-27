package recursion;

public class Fibonacci {
  public static int fib(int n){
	  if(n<=2){return 1;}
	  else{ return fib(n-1)+fib(n-2);}
	  
  }
  public static void main(String[] args) {
	int n=6;
	for(int i=1;i<n;i++){
		int f=fib(i);
		System.out.println("fib("+i+")"+":"+f);
	}
}
}
