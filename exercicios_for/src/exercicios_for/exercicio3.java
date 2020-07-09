package exercicios_for;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try (Scanner sc = new Scanner(System.in)) {
				Locale.setDefault(Locale.US);
				
				System.out.printf("Digite um valor: ");
				int n = sc.nextInt();
				
				double media = 0;
				
				for(int i=0; i<n; i++) {
					
					System.out.printf("Digite a sua 1° nota: ");
					double n1 = sc.nextDouble();
					n1 = n1 * 0.2;
					System.out.printf("Digite a sua 2° nota: ");
					double n2 = sc.nextDouble();
					n2 = n2 * 0.3;
					System.out.printf("Digite a sua 3° nota: ");
					double n3 = sc.nextDouble();
					n3 = n3 * 0.5;
					
					media = n1 + n2 + n3;
					System.out.printf("%nSua nota é: %.1f%n%n", media);
				}
			}
			
	}

}
