package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantily in stock: ");
		product.quantily = sc.nextInt();
		
		System.out.println("");
		System.out.println("product data: " + product);
		
		System.out.println("");
		System.out.print("Enter the number of products to be added in stock: ");
		int quantily = sc.nextInt();
		product.addProducts(quantily);
		
		System.out.println("");
		System.out.println("Update data: " + product);
		
		System.out.println("");
		System.out.print("Enter the number of products to be removed in stock: ");
		quantily = sc.nextInt();
		product.removeProducts(quantily);
		
		System.out.println("");
		System.out.println("Update data: " + product);
		
		sc.close();
	}

}
