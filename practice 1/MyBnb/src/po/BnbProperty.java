package po;

/*Attributes 
 * This class	is	the	 superclass	of	all	types	of	properties.
 * the	necessary attributes(unique register number,owner¡¯s	name,postal	address,
 * rental cost per	day,total number of	season¡¯s rental	days)	
 * and	the	whole set of constructor,mutatorand	accessor methods.
 * */
public class BnbProperty {
	private int registerId;
	private String ownerName;
	private String address;
	private double rentalCost;
	private int rentalDay;

	// constructor
	public BnbProperty() {
	}

	public BnbProperty(int registerId, String ownerName, String address, double rentalCost, int rentalDay) {

		this.registerId = registerId;
		this.ownerName = ownerName;
		this.address = address;
		this.rentalCost = rentalCost;
		this.rentalDay = rentalDay;
	}

	// mutator and accessor methods.
	public int getRegisterId() {
		return registerId;
	}

	public void setRegisterId(int registerId) {
		this.registerId = registerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getRentalCost() {
		return rentalCost;
	}

	public void setRentalCost(double rentalCost) {
		this.rentalCost = rentalCost;
	}

	public int getRentalDay() {
		return rentalDay;
	}

	public void setRentalDay(int rentalDay) {
		this.rentalDay = rentalDay;
	}

	@Override
	public String toString() {
		return "BnbProperty [registerId=" + registerId + ", ownerName=" + ownerName + ", address=" + address
				+ ", rentalCost=" + rentalCost + ", rentalDay=" + rentalDay + "]";
	}

	public void RentProperty(int rentalDays) {
		this.setRentalDay(this.getRentalDay() + rentalDays);
	}
}
