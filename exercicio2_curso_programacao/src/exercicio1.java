import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro número: ");
		int x = sc.nextInt();
		System.out.printf("Digite o segundo número: ");
		int y = sc.nextInt();
		
		int soma = x + y;
		if (soma==0) {
			System.out.println("ERRO! Valor deve ser diferente de 0.");
			
		}else {
			System.out.println("Muito bem!");
			System.out.printf("A soma dos números é: " + soma);
		}
		

		
		sc.close();
	}

}
