public class Car {
	
	private String model;
	private int dataMade;
	private int price;
	private String configuration;
	private String madeIn;
	private String sold;
	private String Buyer;
	
	
	void DataMade(int dataMade) {
		this.dataMade = dataMade;
	}
	
	void Price(int price) {
		this.price = price;
	}
	
	void Configuration(String configuration) {
		this.configuration = configuration;
	}
	
	void MadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	
	void Sold(String sold) {
		this.sold = sold;
	}
	
	void Buyer(String Buyer) {
		this.Buyer = Buyer;
	}
	
	Car(String model){
		this.model = model;
	}
	
	public String toString() {
		return "������� ����������:\n" + "����� ���������� - " + this.model + "\n��� ������� - " + this.dataMade + "\n���� ���������� - " + this.price + "\n������������ - " + this.configuration + "\n������ ������������� - " + this.madeIn + "\n���� ������� - " + this.sold + "\n��� ���������� - " + this.Buyer;     
	}

}