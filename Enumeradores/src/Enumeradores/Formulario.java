package Enumeradores;

public class Formulario {
	private String nome;
	private Genero genero;
	
	enum Genero{
		FEMININO('F'),MASCULINO('M');
		
		private char valor;
		
		Genero(char valor){
			this.valor = valor;
		}
	}
}
