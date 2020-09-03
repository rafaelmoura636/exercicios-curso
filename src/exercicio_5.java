import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o codiogo da peca: ");
		var c1 = sc.nextInt();
		System.out.println("Informe o numero de pecas: ");
		int np1 = sc.nextInt();
		System.out.println("Informe o valor unitario da peca: ");
		double vu1 = sc.nextDouble();
		
		System.out.println("Informe o codiogo da peca: ");
		var c2 = sc.nextInt();
		System.out.println("Informe o numero de pecas: ");
		int np2 = sc.nextInt();
		System.out.println("Informe o valor unitario da peca: ");
		double vu2 = sc.nextDouble();
		
		double valor1 = vu1 * np1;
		double valor2 = vu2 * np2;
		double resultado = valor1 +valor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", resultado);
		
		
		sc.close();
	}

}
