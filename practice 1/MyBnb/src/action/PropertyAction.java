package action;

import java.util.ArrayList;
import java.util.List;

import po.BnbApartment;
import po.BnbHouse;
import po.BnbVilla;

public class PropertyAction {
	private static List<BnbApartment> aparts = new ArrayList<BnbApartment>();
	private static List<BnbHouse> houses = new ArrayList<BnbHouse>();
	private static List<BnbVilla> villas = new ArrayList<BnbVilla>();

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

	public static void PrintAllProperties() {
		for (BnbApartment a : aparts) {
			System.out.println(a);
		}
		for (BnbHouse h : houses) {
			System.out.println(h);
		}
		for (BnbVilla v : villas) {
			System.out.println(v);
		}
	}

	public static double CalculateTotalIncome() {
		double incomes = 0;
		for (BnbApartment a : aparts) {
			incomes += a.getRentalCost() * a.getRentalDay();
		}
		for (BnbHouse h : houses) {
			incomes = incomes + (h.getRentalCost() * h.getRentalDay()) + h.getCleanFee();
		}
		for (BnbVilla v : villas) {
			incomes = incomes + (v.getLuxuryFee() + v.getRentalCost() + v.getServiceFee()) * v.getRentalDay();
		}
		return incomes;
	}
}
