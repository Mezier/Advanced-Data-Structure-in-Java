package basicAlgorithm;

public class Sushu27 {
  private static String  su(int n){
	  StringBuffer sb=new StringBuffer();
	  
	  for(int i=2;i<=n;i++){
		  boolean f=true;
		  for(int j=2;j<=Math.sqrt(i);j++){
			  if(i%j==0){
				  f=false;
				  //sb.append(i+",");
				  break;
			  }
			  
		  }
		  if(f){
			  sb.append(i+",");
		  }
	  }
	  sb.deleteCharAt(sb.length()-1);
	  return sb.toString();
  }
  public static void main(String[] args) {
	String s=su(56);
	System.out.println(s.toString());
}
}
