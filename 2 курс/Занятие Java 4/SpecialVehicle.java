public class SpecialVehicle extends Car {
	private String type;
	private String mass;
	private String size;
	
	public SpecialVehicle(String model, int dataMade, int price, String configuration, String madeIn, String sold, String buyer, String type, String mass, String size) {
		super(model, dataMade, price, configuration, madeIn, sold, buyer);
		this.type = type;
		this.mass = mass;
		this.size = size;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public void setMass(String mass) {
		this.mass = mass;
	}
	public String getMass() {
		return mass;
	}
	
	public void setDimensions(String size) {
		this.size = size;
	}
	public String getDimensions() {
		return size;
	}
	
	public String toString()
    {
        return super.toString() + "\nВид - " + type + "\nМасса - " + mass + "\nГабаритные размеры - " + size;
    }

}