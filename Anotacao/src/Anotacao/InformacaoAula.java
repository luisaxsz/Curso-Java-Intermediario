package Anotacao;

public @interface InformacaoAula {
	String autor();
	int aulaNumero();
	String blog() default "http://loiane.com";
	
}
