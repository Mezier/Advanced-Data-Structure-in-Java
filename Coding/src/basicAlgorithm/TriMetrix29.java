package basicAlgorithm;

public class TriMetrix29 {
  private static int sum(int[][] a){
	  int s=0;
	  int s2=0;
	  int b=a.length;
	  for(int i=0;i<b;i++){
		  for(int j=0;j<a[i].length;j++){
			  if(i==j){
				  s+=a[i][j];
			  }
			  if(j==a.length-1-i){
				  s2+=a[i][j];
			  }
		  }
	  }
	  return s+s2;
  }
  public static void main(String[] args) {
	int a[][]=new int[][]{{2,4,6},{3,5,7},{4,0,8}};
	System.out.println(sum(a));
}
} 
