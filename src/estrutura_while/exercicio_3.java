package estrutura_while;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("Informe um numero: ");
		int x= sc.nextInt();
		while (x != 4) {
			if (x == 1) {
				alcool = alcool + 1;
				x = 0;
				
			}else if (x == 2) {
				gasolina = gasolina +1;
				x = 0;
				
			}else if (x == 3) {
				diesel = diesel + 1;
				x = 0;
				
			}
			System.out.println("Informe um numero: ");
			x = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: "+ alcool);
		System.out.println("Gasolina: "+ gasolina);
		System.out.println("Diesel: "+ diesel);
		

		sc.close();

	}

}
