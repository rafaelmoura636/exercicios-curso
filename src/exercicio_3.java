import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int x = a*b-c*d;
		
		System.out.println("DIFERENCA = "+ x);
		
		
		
		
		sc.close();
		
	}

}
