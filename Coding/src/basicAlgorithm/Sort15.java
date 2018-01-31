package basicAlgorithm;

import java.util.Arrays;

public class Sort15 {
  private static void sorts(int...n){
	  int s[]=new int[n.length];
	  for(int i=0;i<n.length;i++){
		  s[i]=n[i];
	  }
	  Arrays.sort(s);
	  System.out.println(Arrays.toString(s));
  }
  public static void main(String[] args) {
	sorts(12,5,18,7);
}
}
