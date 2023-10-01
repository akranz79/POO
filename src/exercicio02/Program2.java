package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
	
	public static final double PI = 3.14159;
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite o raio do circulo:");
		double radius = sc.nextDouble();
		
		double area = PI * (radius * radius);
		
		System.out.printf("Area: %.4f%n",  area);
		
		sc.close();
		

	}

}
