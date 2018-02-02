package day0202;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Con<A,T>{
	void convert(A from);
}
public class CompareTest {
	public static <T> void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "bob");
		//method 1: annoymous class	
		/*Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
				// descending o2.compareTo(o1);
			}
		});
		System.out.println(names.toString());*/
		Collections.sort(names,(String a, String b) -> {
			 return b.compareTo(a);
			
		});
		System.out.println(names.toString());
	}
}
