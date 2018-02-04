package basicAlgorithm;

public class Age23 {
	private static int age(int n){
		int a=0;
		if(n==1){
			a=10;
		}else{
			a=age(n-1)+2;
		}
		return a;
	}
  public static void main(String[] args) {
	System.out.println(age(5));
}
}
