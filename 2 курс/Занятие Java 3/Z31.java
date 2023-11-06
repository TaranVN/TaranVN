public class Z31 {
	public static void main(String[] args) {
		Car car = new Car("Mercedes-Benz AMG III");
		car.setDataMade(2015);
		car.setPrice(5050000);
		car.setConfiguration("S63 AMG");
		car.setMadeIn("Germany");
		car.setSold("06.06.2022");
		car.setBuyer("John Smith");
		
		System.out.println(car.toString());
	}

}
