package atm;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
//test
public class ATMViewer {
	 public static void main(String[] args) throws Exception
	   {  
	      ATM theATM;

	      try
	      {  
	         Bank theBank = new Bank();
	         theBank.readCustomer("cus.txt");
	         theATM = new ATM(theBank);
	      }
	      catch(IOException e)
	      {  
	         JOptionPane.showMessageDialog(null, "Error opening accounts file.");
	         return;
	      }

	      JFrame frame = new ATMFrame(theATM);
	      frame.setTitle("First National Bank of Java");      
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setVisible(true);
	   }
}
