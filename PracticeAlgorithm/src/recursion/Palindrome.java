package recursion;
//palindrome: A string that is equal to itself when you reverse all characters
public class Palindrome {
	
  public static boolean isPal(String text){
	  boolean f=false;
	  int length=text.length();
	  if (text.length()==0||text.length()==1) return true;
	  char first=Character.toLowerCase(text.charAt(0));
	  char last=Character.toLowerCase(text.charAt(length-1));
	  if(Character.isLetter(first)&&Character.isLetter(last)){
		  if(first==last){
			  
			  return isPal(text.substring(1,length-1));
		  }else{return f;}
	  }else{return f;}
  }
  public static void main(String[] args) {
	  boolean f=isPal("abcdcba");
	System.out.println(f);
}
}
