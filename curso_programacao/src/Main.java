
//Feito pelo Arthur Vital no dia 10/06/2020


public class Main {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5259;
		char gender = 'F';
		double price2 = 650.50;
		double price1 = 2100.0;
		double price3 = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f%n", product1,price1);
		System.out.printf("%s, which price is $ %.2f %n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender:%c%n%n", age,code,gender);
		
		System.out.printf("Measue with eight decimal places: %.8f%n", price3);
		System.out.printf("Rouded (three decimal places: %.3f%n", price3);
		System.out.printf("US decimal point: %.3f", price3);
		
		

	}
}
