package inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class FileDIalogBox {
  public static void main(String[] args) throws IOException {
	JFileChooser c=new JFileChooser();
	FileReader in=null;
	if(c.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
		File name=c.getSelectedFile();
		in=new FileReader(name);
		Scanner s=new Scanner(in);
		System.out.println(s.next());
		in.close();

	}
}
}
