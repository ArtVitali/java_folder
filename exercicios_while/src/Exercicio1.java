import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("-------------BEM VINDO------------");
		System.out.printf("%n%nDIGITE A SENHA PARA CONCLUIR O LOGIN: ");
		int pass = sc.nextInt();
		
		while (pass != 2002) {
			System.out.print("Senha Invalida, digite a senha novamente: ");
			pass = sc.nextInt();
		}
		System.out.print("Acesso Permitido");
		
		sc.close();
		
		
	}

}
