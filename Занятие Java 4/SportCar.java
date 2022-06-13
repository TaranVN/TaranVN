public class SportCar extends Car {
	private String acceleration;
	private String engine;
	private String power;
	
	public SportCar(String model, int dataMade, int price, String configuration, String madeIn, String sold, String buyer, String acceleration, String engine, String power) {
		super(model, dataMade, price, configuration, madeIn, sold, buyer);
		this.acceleration = acceleration;
		this.engine = engine;
		this.power = power;
	}
	
	public void Acceleration(String acceleration) {
		this.acceleration = acceleration;
	}
	public String getAcceleration() {
		return acceleration;
	}
	
	public void Engine(String engine) {
		this.engine = engine;
	}
	public String getEngine() {
		return engine;
	}
	
	public void setPower(String power) {
		this.power = power;
	}
	public String getPower() {
		return power;
	}
	
	public String toString()
    {
        return super.toString() + "\nКол-во секунд до набора скорости - " + acceleration + "\nОбъем двигателя - " + engine + "\nМощность - " + power;
    }

}