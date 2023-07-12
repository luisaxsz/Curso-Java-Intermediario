package Enumeradores;

public class TesteValue {
	public static void main(String[] args) {
		DiaSemana[] dias = DiaSemana.values(); 
		
		for(DiaSemana diaSemana : dias) {
			System.out.println(diaSemana);
		}
	} 
}
