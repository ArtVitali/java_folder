import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
			System.out.printf("Digite o valor de 'A': ");
			int A = sc.nextInt();
			System.out.printf("Digite o valor de 'B': ");
			int B = sc.nextInt();
			
			if(A % B == 0 || B % A ==0) {
				System.out.println("Os n�mero s�o m�ltiplos.");
			}else {
				System.out.println("Os n�meros n�o s�o m�lltiplos.");
			}
		
	}
	}


