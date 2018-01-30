package basicAlgorithm;

public class CompletNum9 {
	private static void comp(int n) {
		int sum = 1;
		int initial = n;
		for (int i = 2; i < n; i++) {
			if(n%i==0){
				sum+=i;
			}
		}
		
		//sum += n;
		// 
		if (sum == initial) {
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			comp(i);
		}
		
	}
	

}
