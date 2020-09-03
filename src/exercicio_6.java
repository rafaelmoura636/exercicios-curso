import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, triangulo, quadrado, circulo, trapezio, retangulo;
		double pi =  3.14159;
		
		
		System.out.println("Infomre o valor de A: ");
		a = sc.nextDouble();
		
		System.out.println("Infomre o valor de B: ");
		b = sc.nextDouble();
		
		System.out.println("Infomre o valor de C: ");
		c = sc.nextDouble();
		
		triangulo = a * c /2.0;
		circulo = pi * c * c;
		trapezio = (a + b)/ 2.0 * c;
		quadrado = b * b;
		retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		
		
		
		sc.close();

	}

}
