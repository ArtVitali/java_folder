import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um n�mero: ");
		int x = sc.nextInt();
		System.out.printf("Digite um segundo n�mero: ");
		int y = sc.nextInt();
		
		double soma = x + y;
		
		System.out.println("A soma dos n�meros �: " + soma);
		
		sc.close();

	}

}
