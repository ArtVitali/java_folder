import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a hora de inicio do jogo: ");
		double x = sc.nextDouble();
		System.out.printf("Digite a hora do fim do jogo: ");
		double y = sc.nextDouble();
		
		double duracao;
		if(x < y) {
				duracao = y - x;
		}else {
			duracao = 24 - x + y;
		}
		
		System.out.printf("O jogo durou: " + duracao + " Horas.");
		
		sc.close();
	}

}
