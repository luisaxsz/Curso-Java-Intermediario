package ThreadsSincronizacao;

public class Calculadora {
	private int soma;
	
	public synchronized int somaArray(int[] array) {
		soma = 0;
		
		//Valor das duas threads sao utilizadas -> saida errada
		//Syncrinized -> so permite que uma thread use o metodo de cada vez sem alterar valor da soma
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
			System.out.println("Executando soma " + Thread.currentThread().getName() + 
					" somando o valor" + array[i] + "Com total de" + soma);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return soma;
	}
}
