import java.util.Locale;
		import java.util.Scanner;

public class exercicio0 {

	public static void main(String[] args) {
				
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				System.out.printf("Digite a largura do terreno: ");
				double larg = sc.nextDouble();
				System.out.printf("Digite o comprimento do terreno: ");
				double comp = sc.nextDouble();
				System.out.printf("Digite o valor do metro quadrado do terreno: ");
				double metroQ = sc.nextDouble();
				
				double area = larg * comp;
				double precoMetro = area * metroQ;
				
				System.out.printf("O valor da área é: %.2f%n", area);
				System.out.printf("O preço do metro quadrado é: %.2f%n", precoMetro);
				
				
				sc.close();
	}

	}


