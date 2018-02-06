package basicAlgorithm;

public class Time49 {
   private static int time(String f,String s){
	   int count=0;
	   for(int i=0;i<f.length();i++){
		   if(f.length()-i>=s.length()&&f.substring(i,i+s.length()).equals(s)){
			   count++;
			   i=i+s.length();
			  // continue;
		   }
	   }
	   return count;
   }
   public static void main(String[] args) {
	   String s="1234";
	System.out.println(time("nbfdfdjnbfdfdfnbvnb","nb"));
  //System.out.println(s.substring(0,4));
   }
}
