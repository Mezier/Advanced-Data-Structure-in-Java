package basicAlgorithm;

public class Comb43 {
    private static int com(int n){
    	int sum=0;
    	for(int i=0;i<=n;i++){
    		for(int j=0;j<=n;j++){
    			if((i*10+j)%2==0){
    				sum++;
    			}
    		}
    	}
    	return sum;
    }
    public static void main(String[] args) {
		System.out.println(com(7));
	}
}
