package basicAlgorithm;

public class Num24 {
   private static int num(int n){
	

	   if(n>99999){
		   return 5;
	   }
	   StringBuffer s=new StringBuffer();
	   while(n>10){
		   s.append(n%10);
		   n=n/10;
	   }
	   s.append(n);
	   System.out.println(s.toString());
	   return s.length();
   }
   public static void main(String[] args) {
	System.out.println(num(2045));
}
}
