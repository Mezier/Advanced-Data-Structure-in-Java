package basicAlgorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort28 {
  public static void main(String[] args) {
	List<Integer> in=Arrays.asList(43,2,5,7,8,9);
	Collections.sort(in,(a,b) -> {return b-a;});
	System.out.println(in.toString());
}
}
