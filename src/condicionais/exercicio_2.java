package condicionais;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Infomre um numero: ");
		int x = sc.nextInt();
		
		if (x % 2 == 0 ) {
			System.out.println("PAR");
		}
		
		else {
			System.out.println("IMPAR");
		}
		
		
		
		
		
		sc.close();

	}

}
