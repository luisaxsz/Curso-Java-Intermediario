package Concatenação;

public class Aula76 {

	public static void main(String[] args) {
		String curso = "Curso";
		String java = "Java";
		String cursoJava = curso + java;
		System.out.println(cursoJava);
		//Resultado 4
		String resultado = "Resultado 2+2 " + (2+2);
		
		//Resultado 22 => pega a string e o primeiro 2 primeiro 
		//depois concatena com o segundo 2
		String resultado2 = "Resultado 2+2 " + 2 + 2;
		
		System.out.println(resultado);
		System.out.println(resultado2);
		
		String concatenacao = "Lorem Ipsum is simply dummy text of the printing and typesetting industry." + 
				"Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " + 
				"when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
		
		System.out.println(concatenacao);
		
		String concatenacao2 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
		concatenacao2 += "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, ";
		
		System.out.println(concatenacao2);
	}

}
