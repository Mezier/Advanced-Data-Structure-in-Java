package basicAlgorithm;

public class Rever25 {
   private static boolean rev(int n){
	   boolean f=false;
	   int initial=n;
	   StringBuffer s=new StringBuffer();
	   while(n>=10){
		   s.append(n%10);
		   n=n/10;
	   }
	   s.append(n);
	   //s.reverse();
	   if(Integer.parseInt(s.toString())==initial){
		   f=true;
		   
	   }
	   System.out.println(initial);
	   System.out.println(s);
	   return f;
   }
   public static void main(String[] args) {
	System.out.println(rev(2328));
}
}
