package EscopoVariaveis;

public class EscopoVariveis {
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	public int calculaValor(int valor) {
		valor = valor + 10;
		
		//Ao usar o this o valor usado é o global
		//this.valor = valor + 10; 
		
		return valor;
	}
	
	public int teste() {
		int valor = 5;
		if(true) {
			valor--;
		}
		
		//this.valor = valor; //referencial ao valor global
		
		return valor;
	}
	
	public int segundoTeste() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		//i++ // erro de compilacao
		
		int j;
		for (j = 0; j < 10; j++) {
			System.out.println(j );
		}
		
		//Foi declarada fora da repeticao -> por isso é possivel acessar
		
		return j;
	}
	
}
