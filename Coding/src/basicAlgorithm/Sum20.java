package basicAlgorithm;
//1 2 3 5 8 13 21

public class Sum20 {
  private static int sum(int n){
	  if(n==1){
		  return 1;
	  }
	  if(n==2){
		  return 2;
	  }
	  return sum(n-1)+sum(n-2);
  }
  public static void main(String[] args) {
	  double s=0.0;
	for(int i=1;i<21;i++){
		s+=(double)sum(i+1)/sum(i);
	}
	System.out.println(s);
}
}
