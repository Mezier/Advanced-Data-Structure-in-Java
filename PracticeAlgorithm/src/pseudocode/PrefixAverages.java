package pseudocode;

import java.util.Arrays;

public class PrefixAverages {
	public static void prefixAverages(double array[]) {
		double X[] = new double[array.length];
		double s = 0;
		for (int i = 0; i < array.length; i++) {
			s = s + array[i];
			X[i] = s / (i + 1);
			
		}
		System.out.println(Arrays.toString(X));

	}

	public static void main(String[] args) {
		double array[] = { 5, 7, 3, 5,10 };
		prefixAverages(array);
	}
}
