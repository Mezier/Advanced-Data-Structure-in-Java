package basicAlgorithm;

public class Peach51 {
	public static int s(int n){
		if(n==5){
			return 1;
		}else{
			return s(n+1)*5+1;
		}
		
		
	}
  public static void main(String[] args) {
	  int sum=s(1);
	System.out.println(sum);
}
}
