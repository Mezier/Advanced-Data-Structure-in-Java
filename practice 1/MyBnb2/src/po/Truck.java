package po;

public class Truck extends Vehicle {
	private int cargoWeight;

	public Truck() {
	}

	public Truck(int id, String ownerName, int totalRentalDays, int rentalCostPerDay, int cargoWeight) {
		super(id, ownerName, totalRentalDays, rentalCostPerDay);
		this.cargoWeight = cargoWeight;
	}

	public int getCargoWeight() {
		return cargoWeight;
	}

	public void setCargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}

	@Override
	public String toString() {
		return super.toString() + "Truck [cargoWeight=" + cargoWeight + "]";
	}

}
