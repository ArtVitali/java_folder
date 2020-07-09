package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student std = new Student();

		System.out.printf("Digite seu nome: ");
		String name = sc.nextLine();
		
		System.out.print("Digite a nota do primeiro semestre: ");
		std.n1 = sc.nextDouble();
		
		System.out.print("Digite a nota do segundo semestre: ");
		std.n2 = sc.nextDouble();
		
		System.out.print("Digite a nota do terceiro semestre: ");
		std.n3 = sc.nextDouble(); 
		
		if(std.finalGrade() < 60.0) {
			
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", std.missingPoints());
		}
		else{
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
