import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Senha = sc.nextInt();
		
		while(Senha != 2002) {
			System.out.println("Senha inválida");
			Senha = sc.nextInt();
		}
			System.out.println("Acesso Permitido");
					
		sc.close();
		
	}

}
