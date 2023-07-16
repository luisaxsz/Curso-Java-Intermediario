package Vargrs;

public class Teste {

	public static void main(String[] args) {
		System.out.println(soma(2, 2));
		System.out.println(soma(2, 2, 2));

		// Vargs permite passar esses numeros diretamente no metodo
		int[] vetor = { 1, 2, 3, 4, 5 };
		System.out.println(soma(vetor));
		//Varags -> possivel passar diversos parametros
		System.out.println(soma(1,2,3,4,5,6,7,8,9,10));
	}

	static int soma(int a, int b) {
		return a + b;
	}

	static int soma(int a, int b, int c) {
		return a + b + c;
	}

	static int soma(int[] vetor) {
		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}

		return total;
	}
	
	//Diversos parametros
	static int soma(Integer...vetor) {
		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}

		return total;
	}	

}
