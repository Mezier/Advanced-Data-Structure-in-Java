package basicAlgorithm;

public class Ball10 {
	public static double distance(int n) {
		double height = 100;
		double d = 0;
		for (int i = 0; i <n; i++) {
d =d+ height+height/2;
height=height/2;
		}
		return d;
	}

	public static double high(int n) {
		//int h = 0;
		double height=100;
		for (int i = 0; i <n; i++) {
          height=height/2;
		}
		return height;
	}
	public static void main(String[] args) {
		System.out.println(distance(1));
		System.out.println(high(10));
		//distance(100,10);
	}
	
}
