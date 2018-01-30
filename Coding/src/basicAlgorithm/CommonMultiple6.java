package basicAlgorithm;

public class CommonMultiple6 {
   private static int MaxDivide(int a,int b){
	   int num=0;
	   a=minNum(a, b);
	   b=maxNum(a, b);
	   for(int i=a;i>=2;i--){
		   if(a%i==0&&b%i==0){
			   num=i;
			   break;
		   }
	   }
	   return num;
   }
   private static int MinMultiple(int a,int b){
	   int num=0;
	   a=minNum(a, b);
	   b=maxNum(a, b);
	   for(int i=b;i<=a*b;i++){
		   if(i%a==0&&i%b==0){
			   num=i;
			   break;
		   }
	   }
	   return num;
   }
   private static int maxNum(int a,int b){
	  
	   if(a>=b){
	   return a;
	   }else{
	   return b;
	   }
   }
   private static int minNum(int a,int b){
	   if(a<=b){
		   return a;
	   }else{
		   return b;
	   }
   }
   public static void main(String[] args) {
	int max=MaxDivide(30, 45);
	int min=MinMultiple(30, 45);
	System.out.println("the max divide number is:"+max+
			" the min multiple number is "+min);
	max_min(30,45);
}
   private static void max_min(int m, int n){
		int temp = 1;
		int yshu = 1;
		int bshu = m*n;
		if(n<m){
			temp = n;
			n = m;
			m = temp;
		}
		while(m!=0){
			temp = n%m;
			n = m;
			m = temp;
		}
		yshu = n;
		bshu /= n;
		System.out.println(m+"and "+n+"max"+yshu);
		System.out.println(m+"and "+n+"min"+bshu);
	}

}
