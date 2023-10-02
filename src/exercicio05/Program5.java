package exercicio05;
	
	import java.util.Locale;
import java.util.Scanner;

	public class Program5 {
		
		public static final double PI = 3.14159;

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entre com os dados de A, B e C:");
			double a = sc.nextDouble();
			sc.nextLine();
			double b = sc.nextDouble();
			sc.nextLine();
			double c = sc.nextDouble();
			
			double triangulo = (a*c)/2;
			double circulo = PI * (c*c);
			double trapezio = ((a+b) *c)/2;
			double quadrado = b*b;
			double retangulo = a*b;
											
			System.out.printf("TRIANGULO: R$ %.3f%n", triangulo);
			System.out.printf("CIRCULO: R$ %.3f%n", circulo);
			System.out.printf("TRAPEZIO: R$ %.3f%n", trapezio);
			System.out.printf("QUADRADO: R$ %.3f%n", quadrado);
			System.out.printf("RETANGULO: R$ %.3f%n", retangulo);

		
			sc.close();
			

		}

	}
