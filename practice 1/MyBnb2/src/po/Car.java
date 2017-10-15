package po;

public class Car extends Vehicle {
	private int passengersNumber;

	public Car(int id,String ownerName, int totalRentalDays, int rentalCostPerDay, int passengersNumber) {
		super(id,ownerName, totalRentalDays, rentalCostPerDay);
		this.passengersNumber = passengersNumber;
	}

	public Car() {
	}

	public int getPassengersNumber() {
		return passengersNumber;
	}

	public void setPassengersNumber(int passengersNumber) {
		this.passengersNumber = passengersNumber;
	}

	@Override
	public String toString() {
		return super.toString() + "Car [passengersNumber=" + passengersNumber + "]";
	}

}
