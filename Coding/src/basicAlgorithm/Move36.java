package basicAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Move36 {
    private static Queue<Integer> move(Queue<Integer> a, int m){
    	//Queue<Integer> b=a;
    	for(int i=0;i<a.size()-m;i++){
    		int n=a.remove();
    		a.add(n);
    	}
    	return a;
    }
    public static void main(String[] args) {
    	 Queue<Integer> a=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<7;i++){
			
				int c=sc.nextInt();
				a.add(c);
			
		}
		System.out.println(a.toString());
		move(a,3);
		System.out.println(a.toString());
	}
}
