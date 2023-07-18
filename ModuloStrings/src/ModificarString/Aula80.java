package ModificarString;

public class Aula80 {

	public static void main(String[] args) {
		String teste = "Isso e um teste.";

		System.out.println(teste);

		// Sub string -> uma parte da String
		System.out.println(teste.substring(5));
		// Possui indicie de inicio e fim
		System.out.println(teste.substring(5, 9));
		
		//Replace -> trocar character
		String espacos = "i s p a ç o s";
		String semEspaco = espacos.replace("i", "e");
		System.out.println(semEspaco);
		// Retirar espacos de uma vez -> passar expressao regulas (regex)
		semEspaco = semEspaco.replaceAll(" ", "");
		System.out.println(semEspaco);
		
		String nome = " Meu nome e: ";
		System.out.println(nome);
		//Trim => remove espacos
		System.out.println(nome.trim());
		
		
		
		
		

	}

}
