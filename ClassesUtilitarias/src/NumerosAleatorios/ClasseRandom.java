package NumerosAleatorios;

import java.util.Random;

public class ClasseRandom {

	public static void main(String[] args) {
		//*n -> Até qual numero queremos ir 
		System.out.println(Math.floor(Math.random()*100));
		
		Random aleatorio = new Random();
		// Valor que quero ir
		System.out.println(aleatorio.nextInt(100 + 1));

	}

}
