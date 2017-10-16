package atm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
  private ArrayList<Customer> cus;
  public Bank(){
	  cus=new ArrayList<Customer>();
  }
  //reads the customer numbers and pins and initialize
  public void readCustomer(String fileName) throws Exception{
	  Scanner sc=new Scanner(new File(fileName));
	  while(sc.hasNext()){
		  int number=sc.nextInt();
		  int pin=sc.nextInt();
		  Customer c=new Customer(number, pin);
		  addCustomer(c);
	  }
	  sc.close();
		  
	  
  }
private void addCustomer(Customer c) {
	// TODO Auto-generated method stub
	cus.add(c);
}
public Customer findCus(int id, int pin){
	for(Customer c:cus){
		if(c.match(id, pin)){
			return c;
		}
	
	}
	return null;
}

}
