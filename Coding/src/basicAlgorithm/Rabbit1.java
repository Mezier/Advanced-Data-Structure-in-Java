package basicAlgorithm;

//there's one rabbit, after the third month, it will born a new
//rabit, how many rabbits are here in the nth month?
//1,1,2,3,5,8,13,21....
public class Rabbit1 {
  public static int getRab(int n){
	  int num=0;
	  if(n==1||n==2){
		  num=1;
	  }else{
		  num=getRab(n-1)+getRab(n-2);
	  }
	  return num;
  }
  public static void main(String[] args) {
	System.out.println(getRab(12));
}
}
