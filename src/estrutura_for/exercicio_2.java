package estrutura_for;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de leituras:");
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i = 0; i<n; i++) {
			int x = sc.nextInt();
			if (x>= 10 && x <= 20) {
				in = in +1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println("In "+ in);
		System.out.println("Out "+ out);
		
		
		
		sc.close();
	}

}
