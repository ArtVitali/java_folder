import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o seu n�mero: ");
		int n = sc.nextInt();
		System.out.printf("Digite a quantidade de horas que voc� trabalha: ");
		double hora = sc.nextDouble();
		System.out.printf("Digite a quantidade que voc� recebe por hora: ");
		double valor = sc.nextDouble();
		
		double salario = hora * valor;
		System.out.printf("O seu n�mero �: " + n);
		System.out.printf("%nSeu sal�rio �: R$" + salario);
		
		
	}

}
