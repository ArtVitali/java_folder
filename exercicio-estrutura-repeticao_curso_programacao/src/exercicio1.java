import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.printf("Digite um número: ");
		int num = sc.nextInt();
		
		
		if (num < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("POSITIVO");
		}
		
		sc.close();

	}

}
