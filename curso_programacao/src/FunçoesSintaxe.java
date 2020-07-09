import java.util.Scanner;

public class Fun�oesSintaxe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.printf("Digite o 1� n�mero: ");
		int a = sc.nextInt();
		System.out.printf("Digite o 2� n�mero: ");
		int b = sc.nextInt();
		System.out.printf("Digite o 3� n�mero: ");
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}
		else if (x > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
