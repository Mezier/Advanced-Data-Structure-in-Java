package basicAlgorithm;

import java.util.ArrayList;

// a!=x, c!=x,z
public class game18 {
	String a, b, c;

	public game18(String a, String b, String c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "game18 [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public static void main(String[] args) {
		String[] racer = { "x", "y", "z" };
		ArrayList<game18> g = new ArrayList<game18>();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					game18 p18 = new game18(racer[i], racer[j], racer[k]);
					if (!p18.a.equals(p18.b) && !p18.a.equals(p18.c) && !p18.b.equals(p18.c) && !p18.a.equals("x")
							&& !p18.c.equals("x") && !p18.c.equals("z")) {
						g.add(p18);
					}

				}
			}
		}
		for (Object o : g) {
			System.out.println(o);
		}
	}
}
