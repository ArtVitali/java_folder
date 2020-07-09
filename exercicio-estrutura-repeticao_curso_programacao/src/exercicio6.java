import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um valor: ");
		int num = sc.nextInt();
		
		if (num >= 0 && num <= 25)
		{
			System.out.printf("Se encontra entre os intervalos 0 e 25");
		}
		else if(num >= 25 && num <= 50) 
		{
			System.out.printf("Se encontra entre os intervalos 25 e 50");
		}
		else if(num >= 50 && num <= 75) 
		{
			System.out.printf("Se encontra entre os intervalos 50 e 75");
		}
		else if(num >= 75 && num <= 100) 
		{
			System.out.printf("Se encontra entre os intervalos 75 e 100");
		}
		else if(num > 100) 
		{
			System.out.printf("Fora de intervalo.");
		}
		
		sc.close();
	}

}
