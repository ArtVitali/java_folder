import java.util.Locale;
import java.util.Scanner;

public class exercicio_com_professor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.printf("Digite a temperatura em Celsius: ");
			double tempC = sc.nextDouble();
			double tempF = (9*tempC/5) + 32;
			System.out.printf("Equivalente em Fahrenheit : %.1f", tempF);
			System.out.printf("%nDeseja repetir? :  (S/N) ");
		    resp = sc.next().charAt(0);
		}while (resp != 'n');
		 
		 
		 sc.close();
		
	}

}
