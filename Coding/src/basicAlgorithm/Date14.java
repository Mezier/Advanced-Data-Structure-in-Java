package basicAlgorithm;

import java.util.Scanner;

public class Date14 {
  private static int days(int year,int month,int day){
	  int c=0;
	  int monthDay[]=new int[]{0,31,28,31,30,31,30,31,31,30,31,30};
	  if((year%4)==0||(year%100)==0){
		  monthDay[2]=29;
	  }
	  for(int i=0;i<month;i++){
		  c+=monthDay[i];
	  }
	  return c+day;
  }
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("please input your date with / in the middle");
	String s=sc.nextLine();
	int d[]=new int[3];
	String ds[]=s.split("/");
	for(int i=0;i<3;i++){
		d[i]=Integer.parseInt(ds[i]);
		//System.out.println(d[i]);
	}
	int a=days(d[0],d[1],d[2]);
	System.out.println(a);
}
}
