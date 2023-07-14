package DesafioEnum;

public enum Operacoes {
	ADICAO("+") {
		@Override
		public double executarOperacao(double valor, double valor2) {
			return valor+valor2;
		}
	},SUBTRACAO("-") {
		@Override
		public double executarOperacao(double valor, double valor2) {
			return valor-valor2;
		}
	},MULTIPLICACAO("*") {
		@Override
		public double executarOperacao(double valor, double valor2) {
			return valor*valor2;
		}
	},DIVISAO("/") {
		@Override
		public double executarOperacao(double valor, double valor2) {
			return valor/valor2;
		}
	};
	
	private String simbolo;
	
	Operacoes(String simbolo){
		this.simbolo = simbolo;
	}
	
	public abstract double executarOperacao(double valor , double valor2);
}
