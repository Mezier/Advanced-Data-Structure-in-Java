package basicAlgorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSort {
   private static void ss(String[] s){
	   List<String> list=Arrays.asList(s);   
	   Collections.sort(list,(a,b)->{return a.compareTo(b);});
	    System.out.println(list.toString());  
   }
   public static void main(String[] args) {
	String[] s={"fddfdf","tre","asd","zxc"};
	ss(s);
}
}
