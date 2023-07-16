package EscopoVariaveis;

public class Teste {

	public static void main(String[] args) {
		EscopoVariveis escopo = new EscopoVariveis();
		escopo.setValor(10);
		
		System.out.println(escopo.getValor());
		System.out.println(escopo.calculaValor(20));
		System.out.println(escopo.getValor());
		

	}

}
