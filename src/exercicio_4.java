import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero do funcionario: ");
		int a = sc.nextInt();
		System.out.println("Informe o numero de horas trabalhadas: ");
		int h = sc.nextInt();
		System.out.println("Infomre o valor por hora trabalhada: ");
		double v = sc.nextDouble();
		
		System.out.printf("NUMBER: %d%n", a);
		
		double x = h * v;
		System.out.printf("SALARY: U$%.2f%n", x);
		
		
		
		
		
		sc.close();
		
	}

}
