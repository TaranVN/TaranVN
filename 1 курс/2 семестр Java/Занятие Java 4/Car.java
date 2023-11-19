public class Car {
	
	private String model;
	private int dataMade;
	private int price;
	private String configuration;
	private String madeIn;
	private String sold;
	private String buyer;
	
	public Car(String model, int dataMade, int price, String configuration, String madeIn, String sold, String buyer ) {
		this.model = model;
		this.dataMade = dataMade;
		this.price = price;
		this.configuration = configuration;
		this.madeIn = madeIn;
		this.sold = sold;
		this.buyer = buyer;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	
	public void setDataMade(int dataMade) {
		this.dataMade = dataMade;
	}
	public int getDataMade(){
		return dataMade;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}
	public String getConfiguration() {
		return configuration;
	}
	
	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	public String getMadeIn() {
		return madeIn;
	}
	
	public void setSold(String sold) {
		this.sold = sold;
	}
	public String getSold() {
		return sold;
	}
	
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getBuyer() {
		return buyer;
	}
	
	public String toString() {
		return "Продажа автомобиля:\n" + "Марка автомобиля - " + model + "\nГод выпуска - " + dataMade + "\nЦена автомобиля - " + price + "\nКомплектация - " + configuration + "\nСтрана производитель - " + madeIn + "\nДата продажи - " + sold + "\nФИО покупателя - " + buyer;     
	}

}