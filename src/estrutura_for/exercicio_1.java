package estrutura_for;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		
		int x = sc.nextInt();
		System.out.println("Os valores impares sao: ");
		for (int i = 1; i <=x  ; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}

}
