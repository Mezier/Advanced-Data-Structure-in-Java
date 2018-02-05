package basicAlgorithm;

public class sum39 {
     private static double  sum(int n){
    	 double s=0;
    	 if(n%2==0){
    		 for(int i=2;i<=n;i+=2){
    			 s+=1.0/i;
    		 }
    	 }
    	 if(n%2!=0){
    		 for(int i=1;i<=n;i+=2){
    			 s+=1.0/i;
    		 }
    	 }
    	 return s;
     }
     public static void main(String[] args) {
		System.out.println(sum(5));
	}
}
