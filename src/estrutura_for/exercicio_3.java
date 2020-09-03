package estrutura_for;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de leituras:");
		
		int n = sc.nextInt();
		
		double a, b, c, media=0;
		
		for (int i=0; i<n; i++) {
			System.out.println("Informe os valores das notas: ");
			a= sc.nextDouble();
			b = sc.nextDouble();
			c= sc.nextDouble();
			media = (a * 2.0 + b * 3.0 + c * 5.0) /10;
			
			System.out.printf("A media foi: %.1f%n", media);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
