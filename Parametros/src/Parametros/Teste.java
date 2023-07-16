package Parametros;

public class Teste {

	public static void main(String[] args) {
		Contato contato = new Contato("Contato 1", "111-111", "Contato1@email.com");
		int valor = 10;
		
		System.out.println(contato);
		System.out.println(valor);
		
		testePassagemReferencia(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
		testePassagemReferencia2(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
	}
	
	public static void testePassagemReferencia(int valor, Contato contato) {
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato = new Contato("Contato2", "2222-2222","Contato2@email.com");
	}
	
	private static void testePassagemReferencia2(int valor, Contato contato) {
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato.setNome("Contato " + novoValor);
	}
}