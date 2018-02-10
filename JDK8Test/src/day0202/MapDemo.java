package day0202;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
   public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5);
	List<Integer> l2=list.stream().map(n->n*2).collect(Collectors.toList());
	System.out.println(l2);
	//	list.stream().map(n->n+1).forEach(System.out::println);
    double totals=l2.stream().reduce((sum, i)->sum+i).get();
    System.out.println(totals);
   // Arrays.stream(myArray).filter(s -> s.length() > 4).toArray(String[]::new);
}
}
