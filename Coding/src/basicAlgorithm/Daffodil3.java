package basicAlgorithm;


/*a three-digit number,  every digit's cube equals itself*/
public class Daffodil3 {
  private static void daffodil(int n){
	  if(n<100){
		  System.out.println("the number is too small");
		  
	  }else{
	  for(int i=100;i<=n;i++){
		  int a=i/100;
		  int b=(i/10)%10;
		  int c=i%10;
		  if(i==a*a*a+b*b*b+c*c*c){
			  System.out.println(i);
		  }
	  }
	  }
  }
  public static void main(String[] args) {
	daffodil(888);
}
}
