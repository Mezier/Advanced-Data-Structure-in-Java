package basicAlgorithm;

public class Diamond19 {
  public static void main(String[] args) {
	  int n=5;
	  for(int i=0;i<n;i++){
			for(int j=0;j<2*n;j++){
		  	if(j<n-i)
		  	  System.out.print(" ");
		  	if(j>=n-i && j<=n+i)
		  	  System.out.print("*");
		  }
		  System.out.println();
		}

	for(int i=1;i<5;i++){
		System.out.print(" ");
		for(int j=0;j<2*5-i;j++){
			if(j<i)
	  	  System.out.print(" ");
	  	if(j>=i && j<2*5-i-1)
	  	  System.out.print("*");
		}
		System.out.println();
	}

}
}
