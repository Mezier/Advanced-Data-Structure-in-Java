package basicAlgorithm;

public class Cal13 {
	
  public static void main(String[] args) {
	  for(long i=1;i<100000;i++){
		  if(Math.sqrt(i+100.0)%1.0==0&&Math.sqrt(i+268.0)%1.0==0){
				System.out.println(i);
			} 
	  }
	 /* int n=0;
		for(int i=0;i<100001;i++){
			if(isCompSqrt(i+100) && isCompSqrt(i+268)){
				n = i;
				break;
			}
		}
		System.out.println("所求的数是："+n);*/

}/*
  private static boolean isCompSqrt(int n){
		boolean isComp = false;
		for(int i=1;i<Math.sqrt(n)+1;i++){
			if(n==Math.pow(i,2)){
				isComp = true;
				break;
			}
		}
		return isComp;
	}*/

}
