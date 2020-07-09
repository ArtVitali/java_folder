import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.printf("Digite o valor de 'A': ");
		int A = sc.nextInt(); 
		System.out.printf("Digite o valor de 'B': ");
		int B = sc.nextInt();
		System.out.printf("Digite o valor de 'C': ");
		int C = sc.nextInt();
		System.out.printf("Digite o valor de 'D': ");
		int D = sc.nextInt();
		
		int dif = A * B - C * D;
		System.out.println("A diferença entre os número é: " + dif);
		
		
	}

}
