package arrays;

import java.util.Arrays;
import java.util.Random;

public class SortArrays {
  public static void main(String[] args) {
    int num[]=new int[5];
    Random r=new Random();
    for(int i=0;i<num.length;i++){
    	num[i]=r.nextInt(50);
   
    }
 	int[] old=num.clone();
 	System.out.println("arrays equal before sort:"+Arrays.equals(num, old));
    Arrays.sort(num);
    int b[]=Arrays.copyOf(num, 7);
 	System.out.println("arrays equal after sort:"+Arrays.equals(num, old));
   System.out.println("old="+Arrays.toString(old));
   System.out.println("new="+Arrays.toString(num));
   System.out.println(Arrays.toString(b));
  }
}
