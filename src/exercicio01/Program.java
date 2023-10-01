package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.println("digite dois valores inteiros:");
		int variavel_a = sc.nextInt();
		sc.nextLine();
		int variavel_b = sc.nextInt();
		
		int soma = variavel_a + variavel_b;
		
		System.out.println("SOMA: "+ soma);
		
		sc.close();
		

	}

}
