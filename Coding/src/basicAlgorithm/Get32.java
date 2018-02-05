package basicAlgorithm;

public class Get32 {
  private static int get(long a){
	  int g=0;
	  if(a>999999){
	  String s=String.valueOf(a).substring(3,7);
	  g=Integer.parseInt(s);
	  }
	  return g;
  }
  public static void main(String[] args) {
	int a=get(765432344);
	System.out.println(a);
}
}
