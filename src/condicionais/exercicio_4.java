package condicionais;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a hora que comecou o jogo: ");
		int a = sc.nextInt();
		System.out.println("Informe a hora que o jogo terminou: ");
		int b  =sc.nextInt();
		
		int duracao;
		
		
		if (a < b) {
			duracao = b - a;
			
			
		}
		else {
			duracao = 24 - a + b;
			
			
		}
		
		System.out.println("O jogo durou "+ duracao + " Hora(s)");
		
		
		sc.close();
	}

}
