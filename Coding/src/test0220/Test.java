package test0220;

import java.io.File;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {
        /*String s="a,b c.d:e;f?g";
        String words[]=s.split(" |,|\\.|\\?|:|@|;|'|(|)|#|*");
        for(String word:words){
            System.out.print(word);
        }*/
        // file=new File("F:\\courses\\COMP47470 Big Data Programming\\proj1\\pg1112.txt");
        String s = "*Project}{ Gutenberg is proud to cooperate with The World Library*\n" +
                "in the} presentation of The Complete Works of William Shakespeare\n" +
                "for your reading for education and entertainment.  HOWEVER, THIS\n" +
                "IS NEITHER SHAREWARE NOR PUBLIC DOMAIN. . .AND UNDER THE LIBRARY\n" +
                "OF THE FUTURE CONDITIONS OF THIS PRESENTATION. . .NO CHARGES MAY\n" +
                "BE MADE FOR *ANY* ACCESS TO THIS MATERIAL.  YOU ARE ENCOURAGED!!\n" +
                "TO GIVE IT AWAY TO ANYONE YOU LIKE, BUT NO CHARGES ARE ALLOWED!!\n" +
                "\n" +
                "\n" +
                "**Welcome To The World of Free Plain Vanilla Electronic Texts**\n" +
                "\n" +
                "**Etexts Readable By Both Humans and By Computers, Since 1971**\n" +
                "\n" +
                "*These Etexts Prepared By Hundreds of Volunteers and Donations*\n" +
                "\n" +
                "Information on contacting Project Gutenberg to get Etexts, and\n" +
                "further information is included below.  We need your donations.";
        StringTokenizer itr = new StringTokenizer(s, " the ");
        while (itr.hasMoreTokens()) {
            System.out.println(itr.nextToken());
        }
    }
}
