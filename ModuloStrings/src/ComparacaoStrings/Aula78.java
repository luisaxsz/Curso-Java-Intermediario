package ComparacaoStrings;

public class Aula78 {

	public static void main(String[] args) {
		String ola = "Ola";
		String ola2 = "oLA";
		String ola3 = "Ola";

		System.out.println("Ola equals ola2 " + ola.equals(ola2));
		System.out.println("Ola equals ola3 " + ola.equals(ola3));
		// Ignora letras maiusculas e minusculas
		System.out.println("Ola equals ola3 " + ola.equalsIgnoreCase(ola2));

		// Valores diferentes -> diferentes referencias
		System.out.println("Ola == Ola1 " + (ola == ola2));
		// Atribuicao simples -> mesmo id/referencia => mesmo valor
		System.out.println("Ola == Ola3 " + (ola == ola3));

		String banana = "banana";
		String ana = "ana";
		String ban = "ban";

		// compara caracteres -> regioes da palavra
		System.out.println(banana.regionMatches(1, ana, 0, 3));
		System.out.println(banana.regionMatches(1, ana, 2, 2));
		//ignore case
		System.out.println(banana.regionMatches(true, 0 , ban, 0, 3));
		
		//endsWith e StartWith => comparar string com outra 
		System.out.println(banana.endsWith(ana));
		System.out.println(banana.startsWith(ban));
		
		//compareTo -> compara objetos 
		//-1 -> a > b
		//0 a == b
		//1 ou > 1 -> a < b
		String a = "a";
		String b = "b";
		String A = "A";
		
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		//Tabela ascii
		System.out.println(a.compareTo(A));

	}

}
