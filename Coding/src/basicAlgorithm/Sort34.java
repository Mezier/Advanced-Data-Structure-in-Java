package basicAlgorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort34 {
  private static void sort3(int a,int b,int c){
	  List<Integer> list=Arrays.asList(a,b,c);
	  Collections.sort(list);
	  System.out.println(list.toString());
  }
  public static void main(String[] args) {
	sort3(6,8,2);
}
}
