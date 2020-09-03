package condicionais;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("POSITIVO");
			
		}
		
		else {
			System.out.println("NEGATIVO");
		}
		
		
		
		sc.close();
		

	}

}
