package JoinSplit;

public class Aula82 {

	public static void main(String[] args) {
		// juntar strings
		String alfabeto = String.join(",", "A", "B", "C");
		System.out.println(alfabeto);
		// Separar String em arrays
		String[] letras = alfabeto.split(",");
		for (String letra : letras ) {
			System.out.println(letra);
		}
	}

}
