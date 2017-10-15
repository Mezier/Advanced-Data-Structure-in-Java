package po;

public class BnbVilla extends BnbProperty {
	private int totalRooms;
	private double serviceFee;
	private double luxuryFee;

	public BnbVilla() {
	}

	public BnbVilla(int registerId, String ownerName, String address, double rentalCost, int RentalDay, int totalRooms,
			double serviceFee, double luxuryFee) {
		super(registerId, ownerName, address, rentalCost, RentalDay);
		this.totalRooms = totalRooms;
		this.serviceFee = serviceFee;
		this.luxuryFee = luxuryFee;
	}

	public int getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(int totalRooms) {
		this.totalRooms = totalRooms;
	}

	public double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}

	public double getLuxuryFee() {
		return luxuryFee;
	}

	public void setLuxuryFee(double luxuryFee) {
		this.luxuryFee = luxuryFee;
	}

	@Override
	public String toString() {
		return "Villa:" + super.toString() + "BnbVilla [totalRooms=" + totalRooms + ", serviceFee=" + serviceFee
				+ ", luxuryFee=" + luxuryFee + "]";
	}

}
