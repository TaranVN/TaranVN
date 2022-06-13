public class Car {
	
	private String model;
	private int dataMade;
	private int price;
	private String configuration;
	private String madeIn;
	private String sold;
	private String Buyer;
	
	
	void setDataMade(int dataMade) {
		this.dataMade = dataMade;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	void setConfiguration(String configuration) {
		this.configuration = configuration;
	}
	
	void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	
	void setSold(String sold) {
		this.sold = sold;
	}
	
	void setBuyer(String Buyer) {
		this.Buyer = Buyer;
	}
	
	Car(String model){
		this.model = model;
	}
	
	public String toString() {
		return "Продажа автомобиля:\n" + "Марка автомобиля - " + this.model + "\nГод выпуска - " + this.dataMade + "\nЦена автомобиля - " + this.price + "\nКомплектация - " + this.configuration + "\nСтрана производитель - " + this.madeIn + "\nДата продажи - " + this.sold + "\nФИО покупателя - " + this.Buyer;     
	}

}
