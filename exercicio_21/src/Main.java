import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N ; i ++) {
			
			double a = sc.nextInt();
			double b = sc.nextInt();
			double saida = 0;
			
			if (b == 0) {
				System.out.println("Divisão impossível");
			}
			else if(a < b){
				saida = 0.0;
				System.out.printf("%.1f%n",saida);
			}else{
				saida = a / b;
				System.out.printf("%.1f%n",saida);
			}
		}
		
		sc.close();

	}

}
