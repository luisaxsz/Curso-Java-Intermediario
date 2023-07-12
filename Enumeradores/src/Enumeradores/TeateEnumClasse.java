package Enumeradores;

public class TeateEnumClasse {
	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.DOMINGO;
		System.out.println(dia.getValor() + " - " + dia.toString());
		
		
		Data data = new Data(10, 2, 2004, DiaSemana.SEXTA);
		
	}
}
