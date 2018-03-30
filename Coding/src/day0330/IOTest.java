package day0330;

import java.io.*;

public class IOTest {
    public static void main(String[] args) throws IOException {
        File f=new File("F:\\javaStudy\\a.txt");
        String s="I am a Chinese";
//        FileOutputStream out=new FileOutputStream(f);
//        out.write(s.getBytes());
//        out.close();
        /*FileWriter fw=new FileWriter(f);
        fw.append(s);
        fw.close();*/
        InputStreamReader fi=new InputStreamReader(new FileInputStream(f));
        BufferedReader br=new BufferedReader(fi);
        String line=br.readLine();
        System.out.println(line);

        while (line!=null){
            line=br.readLine();
            System.out.println(line);
        }
    }
}
