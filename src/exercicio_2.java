import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		System.out.println("Informe o raio: ");
		double r = sc.nextDouble();
		
		double a = pi* r* r;
		
		System.out.printf("A= %.4f%n", a);
		
		
		sc.close();

	}

}
