package estrutura_while;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Infomre X: ");
		int x = sc.nextInt();
		System.out.println("Infomre Y: ");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}else if ( x < 0 && y > 0) {
				System.out.println("Segundo");
			}else if ( x < 0 && y < 0) {
				System.out.println("Terceiro");
			}else {
				System.out.println("Quarto");
			}
			System.out.println("Infomre X: ");
			x = sc.nextInt();
			System.out.println("Infomre Y: ");
			y = sc.nextInt();
			
			
		}

		
		sc.close();

	}

}
