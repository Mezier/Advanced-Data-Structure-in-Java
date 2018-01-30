package basicAlgorithm;

import java.util.Scanner;

//the student whose grade greter than 90 is A;
//whose grade is less than 90 and gretaer than 60 is B
//less than 60 is C
public class Grade5 {
   private static String grade(int score){
	   String s="";
	   s=(score>=90)? "A":(score>=60? "B":"C");
	  
	   return s;
   }
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(grade(n));
	
}
}
