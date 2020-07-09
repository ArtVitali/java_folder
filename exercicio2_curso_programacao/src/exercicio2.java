import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double pi = 3.14159;
		System.out.printf("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double res = (raio * raio) * pi;
		
		System.out.printf("O resultado é: %.4f%n", res);
		
		sc.close();

	}

}
