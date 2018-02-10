package day0202;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class CaculationDemo {
   public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,4,5,76,5,3,9);
	IntSummaryStatistics s=list.stream().mapToInt(x->x).summaryStatistics();
	System.out.println(s.getAverage());
	System.out.println(s.getSum());
	System.out.println(s.getMax());
}
}
