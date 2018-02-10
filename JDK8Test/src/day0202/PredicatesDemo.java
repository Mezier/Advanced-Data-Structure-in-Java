package day0202;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesDemo {
	public static void main(String[] args) {
		Predicate<String> pre = (s) -> s.length() > 0;
		pre.test("foo"); // true
		pre.negate().test("fo"); // false
		List list = Arrays.asList("java", "C", "python", "php");
		System.out.println("language starts with p");
		filter(list, (str) -> str.startsWith("p"));
		System.out.println("all language:");
		filter(list, (str) -> true);
	}
	public static void filter(List<String> names, Predicate<String> condition) {
		/*for (String n : names) {
			if (condition.test(n)) {
				System.out.println(n + " ");
			}
		}*/
		names.stream().filter(condition).forEach((n)->System.out.println(n+" "));
	}
}
