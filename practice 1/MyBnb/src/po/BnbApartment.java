package po;

public class BnbApartment extends BnbProperty {
	private int storeyNum;
	private int bedNum;

	public BnbApartment() {
	}

	public BnbApartment(int registerId, String ownerName, String address, double rentalCost, int rentalDay,
			int storeyNum, int bedNum) {
		super(registerId, ownerName, address, rentalCost, rentalDay);
		this.storeyNum = storeyNum;
		this.bedNum = bedNum;
	}

	public int getStoreyNum() {
		return storeyNum;
	}

	public void setStoreyNum(int storeyNum) {
		this.storeyNum = storeyNum;
	}

	public int getBedNum() {
		return bedNum;
	}

	public void setBedNum(int bedNum) {
		this.bedNum = bedNum;
	}

	@Override
	public String toString() {
		return "Apartment:" + super.toString() + "BnbApartment [storeyNum=" + storeyNum + ", bedNum=" + bedNum + "]";
	}

}
