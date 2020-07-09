import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a hora atual: ");
		double x = sc.nextDouble();
		
		if (x >= 12 && x <= 18){
			System.out.println("Boa tarde");
		}
		else{
			if (x >= 19 && x <= 24){
			System.out.println("Boa noite");
			}else{
				if (x >= 1 && x <= 7) {
				System.out.println("Boa madrugada");
				}else {
					if (x >= 8 && x <= 11) {
					System.out.println("Bom dia");
					}
				}
			}
		}
		
		sc.close();
		
}
}

