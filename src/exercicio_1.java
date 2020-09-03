import java.util.Scanner;

public class exercicio_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor:");
		int a = sc.nextInt();
		System.out.println("Informe o segundo valor: ");
		int b = sc.nextInt();
		
		int c = a + b;
		
		System.out.println("SOMA = " + c);
		
		
		sc.close();
		
		
	}
	
}
