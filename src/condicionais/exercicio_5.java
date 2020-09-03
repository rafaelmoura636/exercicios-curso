package condicionais;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double resultado;
		
		System.out.println("Codigo do intem:");
		int codigo = sc.nextInt();
		System.out.println("Informe a quatidade: ");
		int qtd = sc.nextInt();
		
		if (codigo == 1) {
			resultado = qtd * 4.00;
			System.out.printf("TOTAL: R$ %.2f%n", resultado);
		}
		else if (codigo == 2) {
			resultado = qtd * 4.50;
			System.out.printf("TOTAL: R$ %.2f%n", resultado);
			
		}
		else if (codigo == 3) {
			resultado = qtd * 5.00;
			System.out.printf("TOTAL: R$ %.2f%n", resultado);
			
		}
		else if (codigo == 4) {
			resultado = qtd * 2.00;
			System.out.printf("TOTAL: R$ %.2f%n", resultado);
			
		}
		else if (codigo == 5) {
			resultado = qtd * 1.50;
			System.out.printf("TOTAL: R$ %.2f%n", resultado);
			
			
		}
		
		
		
		sc.close();

	}

}
