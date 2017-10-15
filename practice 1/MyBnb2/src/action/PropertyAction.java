package action;

import java.awt.Color;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import po.BnbApartment;
import po.BnbHouse;
import po.BnbVilla;

public class PropertyAction {
	private static List<BnbApartment> aparts = new ArrayList<BnbApartment>();
	private static List<BnbHouse> houses = new ArrayList<BnbHouse>();
	private static List<BnbVilla> villas = new ArrayList<BnbVilla>();
	private static List<String> lines = new ArrayList<String>();

	public static boolean ReadInputPropertyFile(String s) {
		BnbApartment apart;
		BnbHouse house;
		BnbVilla villa;
		FileReader inputFile;
		String line = "";
		boolean flag = false;
		try {
			inputFile = new FileReader(s);
			Scanner scanFile = new Scanner(inputFile);
			while (scanFile.hasNextLine()) {
				line = scanFile.nextLine();
				lines.add(line);
			}
			List<String> temp = new ArrayList<String>();
			if (lines != null) {
				for (String eachLine : lines) {
					String[] words = eachLine.split(" ");
					String id = words[0];
					if (id.equals("1")) {
						apart = new BnbApartment(1, words[5], words[6], Double.parseDouble(words[3]),
								Integer.parseInt(words[4]), Integer.parseInt(words[1]), Integer.parseInt(words[2]));
						aparts.add(apart);
					} else if (id.equals("2")) {
						house = new BnbHouse(2, words[5], words[6], Double.parseDouble(words[3]),
								Integer.parseInt(words[4]), Integer.parseInt(words[1]), Double.parseDouble(words[2]));
						houses.add(house);
					} else if (id.equals("3")) {
						villa = new BnbVilla(3, words[6], words[7], Double.parseDouble(words[4]),
								Integer.parseInt(words[5]), Integer.parseInt(words[1]), Double.parseDouble(words[2]),
								Double.parseDouble(words[3]));
						villas.add(villa);
					} else {
						temp.add(eachLine);
					}
				}
				lines.removeAll(temp);
				flag = true;
			} else {
				System.out.println("the file is empty!");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	public static void FillInProperties(int num) {
		// insert data to ArrayList
		for (int i = 1; i < num + 1; i++) {
			BnbApartment apart = new BnbApartment(1, "ApartmentOwner" + i, "ApartAddress" + i, i * 1000, 1, i, i);
			BnbHouse house = new BnbHouse(2, "HouseOwner" + i, "HouseAddress" + i, i * 2000, 1, i, 60);
			BnbVilla villa = new BnbVilla(3, "VillaOwner" + i, "VilliAddress" + i, i * 3000, 2, i, 100, i * 30);
			aparts.add(apart);
			houses.add(house);
			villas.add(villa);
		}
		// call RentProperty in Apartment
		for (BnbApartment a : aparts) {
			for (int i = 1; i < 4; i++) {
				a.RentProperty(i);
			}
		}
		// call RentProperty in House
		for (BnbHouse h : houses) {
			for (int i = 1; i < 4; i++) {
				h.RentProperty(i);
			}
		}
		// call RenPropperty in Villa
		for (BnbVilla b : villas) {
			for (int i = 1; i < 4; i++) {
				b.RentProperty(i);
			}
		}

	}

	public static boolean PrintAllProperties(String myFile) {
		boolean flag = false;

		try {
			PrintWriter pw = new PrintWriter(myFile);
			if (aparts != null || houses != null || villas != null) {
				if(aparts!=null){
				for (BnbApartment a : aparts) {
					pw.println(a.toString());
				}
				}
				if(houses!=null){
				for (BnbHouse h : houses) {
					pw.println(h.toString());
				}
				}
				if(villas!=null){
				for (BnbVilla v : villas) {
					pw.println(v.toString());
				}
				}
				flag = true;
			} else {
				pw.println("the input file is null");
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	public static double CalculateTotalIncome() {
		double incomes = 0;
		for (BnbApartment a : aparts) {
			incomes += a.getRentalCost() * a.getRentalDay();
		}
		
		for (BnbHouse h : houses) {
			if(h.getRentalDay()!=0){
			incomes = incomes + (h.getRentalCost() * h.getRentalDay()) + h.getCleanFee();
			}
			}
		
		for (BnbVilla v : villas) {
			incomes = incomes + (v.getLuxuryFee() + v.getRentalCost() + v.getServiceFee()) * v.getRentalDay();
		}
		return incomes;
	}

	public static void GiveRentalProperty() {
		JFrame root_frame = new JFrame();
		JPanel p = new JPanel();
		JTextField jt1 = new JTextField(5);
		JTextField jt2 = new JTextField(5);
		p.add(new JLabel("PropertyId:"));
		p.add(jt1);
		p.add(new JLabel("Rental Days:"));
		p.add(jt2);
		boolean f = false;
		int n = JOptionPane.showConfirmDialog(null, p, "search", JOptionPane.OK_CANCEL_OPTION);
		if (n == JOptionPane.OK_OPTION) {
			int roomId = Integer.parseInt(jt1.getText());
			int days = Integer.parseInt(jt2.getText());
			System.out.println(jt1.getText());
			System.out.println(jt2.getText());
			if (roomId == 1) {
				for (BnbApartment a : aparts) {

					if (days <= 90 - a.getRentalDay()) {
						a.setRentalDay(a.getRentalDay() + days);
						f = true;
						// PrintAllProperties("OutputProperty.txt");
						break;
					}
				}
			} else if (roomId == 2) {
				for (BnbHouse h : houses) {

					if (days <= 90 - h.getRentalDay()) {
						h.setRentalDay(h.getRentalDay() + days);
						f = true;
						// PrintAllProperties("OutputProperty.txt");
						break;
					}
				}
			} else if (roomId == 3) {
				for (BnbVilla v : villas) {

					if (days <= 90 - v.getRentalDay()) {
						v.setRentalDay(v.getRentalDay() + days);
						f = true;
						// PrintAllProperties("OutputProperty.txt");
						break;
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "There's no property type for this ProperId");
			}
			if (f) {
				JOptionPane.showMessageDialog(null,
						"the total rental days in this room has been changed, Please check in OutputProperty.txt");

			} else {
				JOptionPane.showMessageDialog(null, "sorry, there's no enough room for you!");

			}
		}
	}
}
