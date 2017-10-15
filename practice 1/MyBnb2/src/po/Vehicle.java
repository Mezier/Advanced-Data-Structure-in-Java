package po;

import dao.RentalItem;

public class Vehicle implements RentalItem {
	// additional attributes the
	private int id;    // id=1, means this kind of vehicle is car, id=2 means this kind of vehicle is truck
	private String ownerName;
	private int totalRentalDays;
	private int RentalCostPerDay;

	@Override
	public void RentalItem(int RentalDays) {
		// TODO Auto-generated method stub
		this.setTotalRentalDays(this.getTotalRentalDays() + RentalDays - 1);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getTotalRentalDays() {
		return totalRentalDays;
	}

	public void setTotalRentalDays(int totalRentalDays) {
		this.totalRentalDays = totalRentalDays;
	}

	public int getRentalCostPerDay() {
		return RentalCostPerDay;
	}

	public void setRentalCostPerDay(int rentalCostPerDay) {
		RentalCostPerDay = rentalCostPerDay;
	}

	public Vehicle() {
	}

	public Vehicle(int id, String ownerName, int totalRentalDays, int rentalCostPerDay) {
		super();
		this.id = id;
		this.ownerName = ownerName;
		this.totalRentalDays = totalRentalDays;
		RentalCostPerDay = rentalCostPerDay;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", ownerName=" + ownerName + ", totalRentalDays=" + totalRentalDays
				+ ", RentalCostPerDay=" + RentalCostPerDay + "]";
	}

}
