package basicAlgorithm;

public class Monkey17 {
    private static int monkey(int n,int d){
    	int left=0;
    	for(int i=1;i<=d;i++){
    		left=n/2-1;
    	}
    	return left;
    }
    public static void main(String[] args) {
		/*for(int i=11;i<1000;i++){
			if(monkey(i,10)==1){
				System.out.println(i);
				break;
			}
		}*/
    	int m=1;
    	for(int d=10;d>0;d--){
    		m=2*m+2;
    	}
    	System.out.println(m);
	}
}
