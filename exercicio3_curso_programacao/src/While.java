import java.util.Scanner;
import java.util.Locale;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.printf("Digite um n�mero: ");
		
		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.printf("A soma dos n�meros �: " + soma);
		sc.close();
	}
}
