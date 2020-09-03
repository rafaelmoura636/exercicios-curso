package condicionais;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Infomre o primeiro valor: ");
		int a = sc.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		int b = sc.nextInt();
		
		if (a % b ==0 || b % a ==0) {
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
		
		
		sc.close();
		

	}

}
