public class Z41 {
	public static void main(String[] args) {
		Variations variations = new Variations();
		variations.Add(new SportCar("Nissan Z", 2021 , 7000000 , "Performance","Japan", "06.06.2022", "John Smith", "4 �.", "3.0 �.", "405 �.�."));
		variations.Add(new SpecialVehicle("Mercedes-Benz Actros", 2011, 2200000, "1844 LS", "Germany", "06.06.2022", "Eric Bell", "��������", "7000 ��","10000 x 2300 x 3288 ��"));
		variations.Add(new UsedCar("Audi A3", 2015, 1295000, "1.4 TFSI S tronic", "Germany", "06.06.2022", "Nathan Chase", "������", "Douglas Baker", 130000));
		
		System.out.println(variations);
	}

}