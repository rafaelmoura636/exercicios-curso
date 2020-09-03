package estrutura_for;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de vezes: ");
		
		int n = sc.nextInt();
		
		for (int i =0; i<n; i++) {
			System.out.println("Infomre o priemrio numero: ");
			double x = sc.nextInt();
			System.out.println("Informe o segundo numero: ");
			double y = sc.nextInt();
			
			if(y == 0) {
				System.out.println("Divisao Impossivel.");
				
			}
			else {
				double divisao = x / y;
				System.out.println(divisao);
			}
			
		}
		
		
		
		
		
		
		sc.close();
		

	}

}
