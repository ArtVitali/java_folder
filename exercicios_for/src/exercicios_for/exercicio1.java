package exercicios_for;

import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite um n�mero: ");
			int x = sc.nextInt();
			
			for( int i=1; i<=x; i++) {
				if (i % 2 == 0) {
					System.out.println("Os n�meros pares s�o: " + i);
				}
			}

			for( int i=1; i<=x; i++) {
				if (i % 2 == 1) {
					System.out.println("Os n�meros impares s�o: " + i);
				}
			}
			sc.close();
	}

}

