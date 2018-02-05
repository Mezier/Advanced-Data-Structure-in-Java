package basicAlgorithm;

import java.util.Scanner;

public class Week26 {
	private static String judge(String a) {
		String s = "";
		for (int i = 0; i < a.length(); i++) {
			char x = a.charAt(i);
			switch (x) {
			case 'M':
				s = "Monday";
				break;
			case 'T':

			{
				if (a.length() > 1 && a.charAt(i + 1) == 'u') {
					// System.out.println(a.charAt(i+1)=='u');
					s = "Tuesday";
					System.out.println(s);
					return s;
				} else if (a.length() > 1 && Character.toString(a.charAt(i + 1)).equals('h')) {
					s = "Thursday";

				}
			}
				;
				break;
			case 'W':
				s = "Wednesday";
				break;
			case 'F':
				s = "Friday";
				break;
			case 'S':
				if (a.length() > 1 && Character.toString(a.charAt(i + 1)).equals("a")) {
					s = "Saturday";

				} else if (a.length() > 1 && Character.toString(a.charAt(i + 1)).equals('u')) {
					s = "Sunnday";

				}
				;
				break;
			default:
				s = "wrong";
				break;
			}
		}
		System.out.println(s);
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		judge(s);
	}
}
