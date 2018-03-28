package day0322Repeat2;

import java.util.Arrays;
import java.util.List;

public class Question40 {
    public static String[] so(String s[]){
        List<String> list= Arrays.asList(s);
        list.sort((String x,String y)->{return x.compareTo(y);});
        String[] sorted= (String[]) list.toArray();
        return sorted;
    }

    public static void main(String[] args) {
        String [] s=so(new String[]{"gfd","tr","wert","asd"});
        for(String i:s){
            System.out.println(i);
        }
    }

}
