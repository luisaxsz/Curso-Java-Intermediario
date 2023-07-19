package StringBuilderStringBuffer;

public class Aula83 {

	public static void main(String[] args) {
		String[] letras = {"A", "B", "C","D"};
		String alfabeto = "";
		//Coleção de strings  -> thread safe
		StringBuffer sb = new StringBuffer();
		for (String letra : letras) {
			sb.append(letra);
		}
		
		alfabeto = sb.toString();
		System.out.println(alfabeto);
		
		//String ao contrario
		System.out.println(sb.reverse().toString());
		
		//não e thread safe 
		StringBuilder sb_ = new StringBuilder();
	}

}
