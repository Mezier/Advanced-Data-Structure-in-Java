package po;

public class BnbHouse extends BnbProperty {
	private int totalStorey;
	private double cleanFee;

	public BnbHouse() {
	}

	public BnbHouse(int registerId, String ownerName, String address, double rentalCost, int RentalDay, int totalStorey,
			double cleanFee) {
		super(registerId, ownerName, address, rentalCost, RentalDay);
		this.totalStorey = totalStorey;
		this.cleanFee = cleanFee;
	}

	public int getTotalStorey() {
		return totalStorey;
	}

	public void setTotalStorey(int totalStorey) {
		this.totalStorey = totalStorey;
	}

	public double getCleanFee() {
		return cleanFee;
	}

	public void setCleanFee(double cleanFee) {
		this.cleanFee = cleanFee;
	}

	@Override
	public String toString() {
		return "House:" + super.toString() + "BnbHouse [totalStorey=" + totalStorey + ", cleanFee=" + cleanFee + "]";
	}

}
