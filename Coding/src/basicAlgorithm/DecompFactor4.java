package basicAlgorithm;

public class DecompFactor4 {
  private static String decomp(int n){
	  StringBuffer s=new StringBuffer();
	  s.append("n=");
	  for(int i=2;i<Math.sqrt(n);i++){
		  
		  if(n%i==0){
			  s.append(i);
			  s.append("*");
			  n=n/i;
			  
			  decomp(n);
		  }
	  }
	  
	  s.append(n);
	  //s.append("1");
	  return s.toString();
  }
  public static void main(String[] args) {
	System.out.println(decomp(90));
}
}
