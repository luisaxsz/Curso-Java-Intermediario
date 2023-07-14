package DesafioEnum;

public class TesteCalc {

	public static void main(String[] args) {
		for (Operacoes operacao : Operacoes.values()) {
			System.out.println(operacao + ": " + operacao.executarOperacao(2, 2));
		}
	}

}
