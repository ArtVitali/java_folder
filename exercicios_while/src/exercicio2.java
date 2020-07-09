import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o valor de 'x': ");
		int x = sc.nextInt();
		System.out.printf("Digite o valor de 'y': ");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0){
			
				if (x > 0 && y > 0) {
					System.out.printf("%nprimeiro");
				}
				else if (x < 0 && y > 0) {
					System.out.printf("%nsegundo");
				}
				else if (x < 0 && y < 0) {
					System.out.printf("%nterceiro");
				}
				else if(x > 0 && y < 0) {
					System.out.printf("%nquarto");
				}
				System.out.printf("%nDigite o valor de 'x': ");
				x = sc.nextInt();
				System.out.printf("Digite o valor de 'y': ");
				y = sc.nextInt();
		}
		
		sc.close();
		
	}
}
