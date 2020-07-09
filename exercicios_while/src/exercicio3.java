import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int diesel = 0;
		int gasolina = 0;
		int alcool = 0;
		
		System.out.printf("Digite o produto desejado: ");
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			
			if (tipo == 1) {
				System.out.printf("Alcool: ");
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				System.out.printf("Gasolina: ");
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				System.out.printf("Diesel: ");
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
