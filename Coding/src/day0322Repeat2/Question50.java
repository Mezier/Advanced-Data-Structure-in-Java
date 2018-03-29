package day0322Repeat2;

import java.io.*;
import java.util.Scanner;

class Student{
    private int id;
    private String name;
    private int grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
public class Question50 {
    public static void res(String s){
        String sub[]=s.trim().split(" ");
    }

    public static void main(String[] args) throws IOException {
        String[] records=new String[2];
        System.out.println("please input five records:");

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            System.out.println("the "+(i+1)+" number: ");
           records[i]=sc.nextLine();
        }
        FileWriter fw=new FileWriter("F:\\javaStudy\\a.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(records.toString());
        for(int i=0;i<records.length;i++){
            bw.write(records[i].toString());
        }
        bw.close();
        System.out.println(records.toString());

    }
}
