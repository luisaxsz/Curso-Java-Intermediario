package FazendoBuscas;

public class Aula79 {

	public static void main(String[] args) {
		String banana = "banana";
		String ana = "ana";

		// Retorna indicie character
		System.out.println(banana.indexOf('a'));
		// -1 não existe
		System.out.println(banana.indexOf('x'));
		System.out.println(banana.indexOf(ana));

		// Qual ultima vez que character aparece na string
		System.out.println(banana.lastIndexOf('a'));

		// Contains -> Se character existe na string
		System.out.println(banana.contains(ana));
	}

}
