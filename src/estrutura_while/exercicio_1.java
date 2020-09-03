package estrutura_while;



import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Infomre a senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha invalida");
			System.out.println("Infomre a senha: ");
			
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		
		sc.close();

	}

}