import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o seu número: ");
		int n = sc.nextInt();
		System.out.printf("Digite a quantidade de horas que você trabalha: ");
		double hora = sc.nextDouble();
		System.out.printf("Digite a quantidade que você recebe por hora: ");
		double valor = sc.nextDouble();
		
		double salario = hora * valor;
		System.out.printf("O seu número é: " + n);
		System.out.printf("%nSeu salário é: R$" + salario);
		
		
	}

}
