import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A,B,C;
		double pi = 3.14159;
		
		System.out.printf("Digite o valor de 'A': ");
		A = sc.nextDouble();
		System.out.printf("Digite agora o valor de 'B': ");
		B = sc.nextDouble();
		System.out.printf("Digite agora o valor de 'C': ");
		C = sc.nextDouble();
		
		double areaT = A * C / 2.0;
		System.out.printf("A área do triângulo retângulo é: %.3f", areaT);
		
		double areaC =  pi * C * C;
		System.out.printf("%nA área do círculo é: %.3f", areaC);
		
		double areaTP = (A + B) / 2.0 * C;
		System.out.printf("%nA área do trapézio é: %.3f", areaTP);
		
		double areaQ = (B * B);
		System.out.printf("%nA área do quadrado é: %.3f", areaQ);
		
		double areaR = A * B;
		System.out.printf("%nA área do retângulo é: %.3f", areaR);
		
		sc.close();

	}

}
