package exercicio06;
	
	import java.util.Locale;
	import java.util.Scanner;

	public class Program6 {
		
		

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("digite a matricula do funcionario:");
			int matricula = sc.nextInt();
			
			System.out.println("Quantidade de horas trabalhadas:");
			int horas_trabalhadas = sc.nextInt();
			
			System.out.println("Valor da hora: ");
			double valor_hora = sc.nextDouble();
			
			double calcula_salario = (horas_trabalhadas * valor_hora);
			
			System.out.println("Number: "+ matricula);
			System.out.printf("Salary: U$ %.2f%n", calcula_salario);
		
			sc.close();
			

		}

	}
