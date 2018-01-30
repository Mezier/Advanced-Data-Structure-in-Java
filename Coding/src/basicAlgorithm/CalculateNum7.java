package basicAlgorithm;

import java.util.Scanner;

public class CalculateNum7 {
  private static int[] caculate(String s){
	  int[] nums=new int[4];
	  /*0: letters 1: space 2: numer 3: other*/
	  char[] c=s.toCharArray();
	  for(int i=0;i<c.length;i++){
		 
		  if(Character.isDigit(c[i])){
			  nums[2]++;
			  
		  }else if(Character.isLetter(c[i])){
			  nums[0]++;
			  
		  }else if(Character.isSpaceChar(c[i])){
			  nums[1]++;
			 
		  }else{
			  nums[3]++;
			
		  }
	  }
	  System.out.println("letter:"+nums[0]);
	  System.out.println("space:"+nums[1]);
	  System.out.println("number:"+nums[2]);
	  System.out.println("others:"+nums[3]);
	  return nums;
  }
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String s=sc.nextLine();
	  System.out.println(s);
	caculate(s);
}
}
