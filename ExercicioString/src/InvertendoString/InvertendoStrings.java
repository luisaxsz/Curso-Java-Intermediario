package InvertendoString;

import java.util.Scanner;

public class InvertendoStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = scan.nextLine();
		
		StringBuffer sb = new StringBuffer(palavra);
		
		String palavraInversa = sb.reverse().toString();
		System.out.println(palavraInversa);
		
		if(palavra.equalsIgnoreCase(palavraInversa)) {
			System.out.println("Essa palavra e um palindromo");
		}else {
			System.out.println("Essa palavra nao e um palindromo");
		}
	}
}
