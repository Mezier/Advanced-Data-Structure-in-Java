package day0330;

import java.io.*;

public class IOFIle {
    public static void readFile(String file) throws Exception{
        File f=new File(file);
        if(f.exists()){
            FileInputStream fr=new FileInputStream(f);
            byte b[]=new byte[1024];
            int hasRead=0;
            while((hasRead=fr.read(b))>0){
                System.out.println(new String(b,0,hasRead));
            }
            fr.close();

        }
    }
    public static void writeFile(String path) throws Exception{
        FileInputStream fi=new FileInputStream("F:\\javaStudy\\a.txt");
        FileOutputStream fo=new FileOutputStream(path);
        byte[] b=new byte[1024];
        int hasRead=0;
        while((hasRead=fi.read(b))>0){
            fo.write(b,0,hasRead);
        }
        fi.close();
        fo.close();

    }
    public static void readByLine(String path) throws Exception{
        InputStreamReader reader=new InputStreamReader(new FileInputStream(path));
        BufferedReader br=new BufferedReader(reader);
        String line=null;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
    public static void main(String[] args) throws Exception {
        //readFile("F:\\javaStudy\\a.txt");
        //readByLine("F:\\javaStudy\\a.txt");
        writeFile("F:\\javaStudy\\c.txt");

    }
}
