import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Infome a largura:");
		double l = sc.nextDouble();
		System.out.println("Infome o comprimento:");
		double c = sc.nextDouble();
		System.out.println("Infomre o valor por metro quadrado:");
		double m = sc.nextDouble();
		
		double a = l*c;
		double p = a * m;
		System.out.printf("Area = %.2f%n ", a);
		System.out.printf("Preco = R$ %.2f%n", p);
		
		sc.close();
		
		
	}

}
