import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, numero1, codigo2, numero2;
		double valor1, valor2, valorTotal;
		
		codigo1 = sc.nextInt();
		numero1 = sc.nextInt();
		valor1 = sc.nextDouble();
		codigo2 = sc.nextInt();
		numero2 = sc.nextInt();
		valor2 = sc.nextDouble();

		valorTotal = numero1 * valor1 + numero2 * valor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		sc.close();
		
	}

}
