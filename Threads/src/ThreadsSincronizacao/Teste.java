package ThreadsSincronizacao;

public class Teste {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		ThreadSoma soma1 = new ThreadSoma("Thread #1", array);
		ThreadSoma soma2 = new ThreadSoma("Thread #2", array);
	}

}
