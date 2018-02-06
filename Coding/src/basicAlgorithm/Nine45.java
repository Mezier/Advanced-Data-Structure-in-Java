package basicAlgorithm;

public class Nine45 {
   private static boolean isPrime(int n){
	   boolean f=true;
	   for(int i=2;i<=Math.sqrt(n);i++){
		   if(n%i==0){
			   f=false;
			   break;
		   }
	   }
	   return f;
	   
   }
   public static void main(String[] args) {
	int n=13*999;
	int count=0;
	while(n>8){
		n=n/9;
		count++;
	}
	System.out.println(count);
}
}
