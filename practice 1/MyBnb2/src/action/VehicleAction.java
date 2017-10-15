package action;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import po.BnbApartment;
import po.BnbHouse;
import po.BnbVilla;
import po.Car;
import po.Truck;

public class VehicleAction {
	private static List<Car> cars = new ArrayList<Car>();
	private static List<Truck> trucks = new ArrayList<Truck>();
	private static List<String> lines = new ArrayList<String>();

	public static boolean readInputVehicleFile(String s) {
		Car car;
		Truck truck;
		boolean f = false;
		String line = "";
		FileReader inputFile;
		try {
			inputFile = new FileReader(s);
			Scanner scanFile = new Scanner(inputFile);
			while (scanFile.hasNextLine()) {
				line = scanFile.nextLine();
				lines.add(line);
			}
			List<String> removeLine = new ArrayList<String>();
			if (lines != null) {
				for (String word : lines) {
					String words[] = word.split(" ");
					String id = words[0];
					if (id.equals("1")) { // it's car
						car = new Car(1, words[1], Integer.parseInt(words[2]), Integer.parseInt(words[3]),
								Integer.parseInt(words[4]));
						cars.add(car);
					} else if (id.equals("2")) {
						truck = new Truck(2, words[1], Integer.parseInt(words[2]), Integer.parseInt(words[3]),
								Integer.parseInt(words[4]));
						trucks.add(truck);
					} else {
						removeLine.add(word);
					}
				}
				lines.remove(removeLine);

				f = true;
			} else {
				System.out.println("the file is empty");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return f;
	}

	public static boolean fillInVehicles(int num) {
		boolean f = false;
		for (int i = 1; i < 4; i++) {
			Car c = new Car(1, "name" + i, i * 10, i, i);
			Truck t = new Truck(2, "name" + i, i * 20, i, i * 100);
			cars.add(c);
			trucks.add(t);
		}
		for(Car c:cars){
			c.RentalItem(num);
		}
		for(Truck t:trucks){
			t.RentalItem(num);
		}
		if(cars!=null&&trucks!=null){
			f=true;
		}
		return f;
	}

	public static boolean printAllVehicles(String myFile) {
		boolean f = false;
		

		try {
			PrintWriter pw = new PrintWriter(myFile);
			if (cars != null && trucks != null) {
				for (Car c : cars) {
					pw.println(c.toString());
				}
				for (Truck t : trucks) {
					pw.println(t.toString());
				}
				
				f = true;
			} else {
				pw.println("the input file is null");
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return f;
	}
	public static int calculateVehicleTotalIncome(){
		int fees=0;
		for(Car c:cars){
			fees+=c.getTotalRentalDays()*c.getRentalCostPerDay();
		}
		for(Truck t:trucks){
			fees=fees+t.getTotalRentalDays()*t.getRentalCostPerDay()+t.getCargoWeight();
		}
		return fees;
	}
}
