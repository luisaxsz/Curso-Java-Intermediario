package Printf;

public class ExemploPrintf {

	public static void main(String[] args) {
		System.out.printf("%s", "Ola mundo");
		System.out.printf("%n");
		System.out.printf("%S", "Ola");
		
		int valor = 123456;
		
		System.out.printf("%n");
		System.out.printf("%d", valor);
		System.out.printf("% d", valor);
		System.out.printf("%n");
		
		double pontoFlutuante = 1.123459;
		System.out.printf("%.3f", pontoFlutuante);
		System.out.printf("R$%7.3f", pontoFlutuante);
		
	}

}
