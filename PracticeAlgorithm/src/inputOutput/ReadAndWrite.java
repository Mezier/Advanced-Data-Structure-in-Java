package inputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

// read a file and then write it to a specific file
public class ReadAndWrite {
	public static void main(String[] args) throws FileNotFoundException {
       Scanner sc=new Scanner(System.in);
       System.out.println("please input your input file name:");
       String inName=sc.nextLine();
       System.out.println("please input your output file name");
       String outName=sc.nextLine();
       FileReader fr=new FileReader(inName);
       Scanner in=new Scanner(fr);
       PrintWriter pw=new PrintWriter(outName);
       int lineNum=1;
       while(in.hasNext()){
    	   pw.println("/*"+lineNum+"*/"+in.nextLine());
    	   lineNum++;
       }
       in.close();
       pw.close();
	}
}
