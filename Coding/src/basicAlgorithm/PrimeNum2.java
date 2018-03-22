package basicAlgorithm;

//what's the prime number between n and m
public class PrimeNum2 {
	public static int getPrime(int a, int b) {
		int i = 0;
		if (a > b) {
			int tem = a;
			a = b;
			b = tem;
		}
		for (int x = a; x <= b; x++) {
			boolean flag = true;
			for (int y = 2; y <= Math.sqrt(x); y++) {
				if (x % y == 0) {
					i++;
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(x);
			}
		}

		return b - a + 1 - i;
	}

	private static boolean isPrime(int n) {
		boolean flag = true;
		if (n == 1)
			flag = false;
		else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if ((n % i) == 0 || n == 1) {
					flag = false;
					break;
				} else
					flag = true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println("The number of Prime is :" + getPrime(100, 200));

	}
}
