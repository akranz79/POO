package exercicio04;
	
	import java.util.Locale;
	import java.util.Scanner;

	public class Program4 {
		
		

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("digite 4 valores inteiros:");
			int a = sc.nextInt();
			sc.nextLine();
			int b = sc.nextInt();
			sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			int d = sc.nextInt();
			
			int diferenca = (a * b - c * d);
			
			System.out.println("SOMA: "+ diferenca);
			
			sc.close();
			

		}

	}
