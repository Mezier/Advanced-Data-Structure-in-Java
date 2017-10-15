package action;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class test {
	public static void main(String[] args) {
		//property test
		PropertyAction p = new PropertyAction();
		String s = "inputData.txt";
		boolean f1 = p.ReadInputPropertyFile(s);
		p.GiveRentalProperty();
		double incomes = p.CalculateTotalIncome();
		boolean f2 = p.PrintAllProperties("OutputProperty.txt");
		if (f1 && f2) {
			System.out.println("the property file has been written");
			System.out.println("the total income of property is:" + incomes);
		}
		//vehicle test
		  VehicleAction va=new VehicleAction(); 
		  String s2="InputVehicle.txt";
		  va.readInputVehicleFile(s2);
		  va.fillInVehicles(3); 
		  boolean flag=va.printAllVehicles("OutputVehicle.txt"); 
		  if(flag){
		  System.out.println("the vehicle ouputFile has been written, and the total incomes is:"+va.calculateVehicleTotalIncome());
		  }else{
			  System.out.println("it hasn't been written");
		  }
		 
	}
}
