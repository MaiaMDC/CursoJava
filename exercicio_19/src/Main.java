import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < N ; i++) {
			int intervalo = sc.nextInt();
			if(intervalo >= 10 && intervalo <= 20) {
				in += 1;				
			}
			else {
				out += 1;
			}
			
		}

		System.out.println(in + " in\n" + out + " out ");
		
		sc.close();
		
	}

}
