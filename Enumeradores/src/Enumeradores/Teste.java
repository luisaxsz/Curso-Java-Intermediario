package Enumeradores;

public class Teste {
	public static void main(String[] args) {
		usandoConstantes();
		utilizandoEnum();
	}
	public static void usandoConstantes() {
		int segunda = Constantes.SEGUNDA;
		int terca = Constantes.TERCA;
		int quarta = Constantes.QUARTA;
		int quinta = Constantes.QUINTA;
		int sexta = Constantes.SEXTA;
		int sabado = Constantes.SABADO;
		int domingo = Constantes.DOMINGO;
		
		System.out.println("Constantes java");
		
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}
	public static void imprimeDiaSemana(int dia) {
		switch (dia) {
		case 1: System.out.println("Segunda"); break;
		case 2: System.out.println("Terca"); break;
		case 3: System.out.println("Quarta"); break;
		case 4: System.out.println("Quinta"); break;
		case 5: System.out.println("Sexta"); break;
		case 6: System.out.println("Sabado"); break;
		case 0: System.out.println("Domingo"); break;
		}
	}
	
	public static void utilizandoEnum(){
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("Enum java");
		
		imprimeEnum(segunda);
		imprimeEnum(terca);
		imprimeEnum(quarta);
		imprimeEnum(quinta);
		imprimeEnum(sexta);
		imprimeEnum(sabado);
		imprimeEnum(domingo);
	}
	
	public static void imprimeEnum(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA: System.out.println("SEGUNDA"); break;
		case TERCA: System.out.println("TERCA"); break;
		case QUARTA: System.out.println("QUARTA"); break;
		case QUINTA: System.out.println("QUINTA"); break;
		case SEXTA: System.out.println("SEXTA"); break;
		case SABADO: System.out.println("SABADO"); break;
		case DOMINGO: System.out.println("DOMINGO"); break;
		}
	}
}
