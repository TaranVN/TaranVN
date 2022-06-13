public class Z31 {
	public static void main(String[] args) {
		Car car = new Car("Mercedes-Benz AMG III");
		car.DataMade(2015);
		car.Price(5050000);
		car.Configuration("S63 AMG");
		car.MadeIn("Germany");
		car.Sold("06.06.2022");
		car.Buyer("John Smith");
		
		System.out.println(car.toString());
	}

}