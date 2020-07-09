import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o código do produto desejado: ");
		int codigo = sc.nextInt();
		System.out.printf("Digite a quantidade do produto desejado: ");
		int quantidade = sc.nextInt();
		
		double total = 0;
		
		if (codigo == 1) 
		{
				System.out.printf("Você escolheu " + quantidade + " Cachorro-Quente");
				total = quantidade * 4.00;
		}
		else if (codigo == 2)
		{
				System.out.printf("Você escolheu " + quantidade + " X-salada");
				total = quantidade * 4.50;
		}
		else if (codigo == 3) 
		{
				System.out.printf("Você escolheu " + quantidade + " X-Bacon");
				total = quantidade * 5.00;
		}
		else if(codigo == 4) 
		{
				System.out.printf("Você escolheu " + quantidade + " Torrada Simples");
				total = quantidade * 2.00;
		}
		else if(codigo == 5) 
		{
				System.out.printf("Você escolheu " + quantidade + " Refrigerante");
				total = quantidade * 1.50;
		}
		System.out.printf("%nO total deu: %.2f%n", total);
		sc.close();
		
}
}
		
		
		

		





