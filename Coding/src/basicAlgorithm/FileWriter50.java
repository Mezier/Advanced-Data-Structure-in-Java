package basicAlgorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student{
	private int id;
	private String name;
	private int score;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	
	
}
public class FileWriter50 {
	public static void main(String[] args) throws IOException {
		
	
    Scanner sc=new Scanner(System.in);
    System.out.println("please input your id:");
    int id=sc.nextInt();
    System.out.println("please input your name:");
    String s=sc.next();
    System.out.println("please input your score");
    int score=sc.nextInt();
    Student stu=new Student(id,s,score);
    FileWriter fw;
    BufferedWriter bw;
    fw=new FileWriter("");
	bw=new BufferedWriter(fw);
    try {
		
		bw.write(stu.toString());
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		bw.close();
	}
	}
    
}
