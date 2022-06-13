public class UsedCar extends Car {
	private String safety;
	private String previousOwner;
	private int mileage;
	
	public UsedCar(String model, int dataMade, int price, String configuration, String madeIn, String sold, String buyer, String safety, String previousOwner, int mileage) {
		super(model, dataMade, price, configuration, madeIn, sold, buyer);
		this.safety = safety;
		this.previousOwner = previousOwner;
		this.mileage = mileage;
	}
	
	public void setSafety(String safety) {
		this.safety = safety;
	}
	public String getSafety() {
		return safety;
	}
	
	public void setPreviousOwner(String previousOwner) {
		this.previousOwner = previousOwner;
	}
	public String getPreviousOwner() {
		return previousOwner;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getMileage() {
		return mileage;
	}
	
	public String toString()
    {
        return super.toString() + "\nCтепень сохранности - " + safety + "\nФИО владельца - " + previousOwner + "\nПробег - " + mileage;
    }
}





