import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); //Chamada do leitor
		
		String original = "abcde FHIJ ABC abc DEFG";
		
		/*
		 Aqui inicia a declara��o e leitura das v�ri�veis.
		 */
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		/*
		 Aqui encerra a leitura das vari�veis.
		 
		 Abaixo inicia as impress�es.
		 */
		
		System.out.println("original - " + original + "-");
		System.out.println("toLowerCase - " + s01 + "-");
		System.out.println("toUpperCase - " + s02 + "-");
		System.out.println("trim -" + s03 + "-");
		System.out.println("substring (2) -" + s04 + "-");
		System.out.println("substring(2, 9) -" + s05 + "-");
		System.out.println("replace('a', 'x') -" + s06 + "-");
		System.out.println("replace('abc', 'xy') -" + s07 + "-");
		System.out.println("index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

		
		sc.close();

	}

}
