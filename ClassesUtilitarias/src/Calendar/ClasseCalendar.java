package Calendar;

import java.util.Calendar;

public class ClasseCalendar {
	public static void main(String[] args) {
		//Ja retorna a instância -> singleTon -> padrão
		Calendar hoje = Calendar.getInstance();
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		
		System.out.println(hora);
		System.out.println(ano);
		System.out.println(mes);
		System.out.println(hoje);
		
		System.out.printf("Hoje e: %d/%d/%d", dia, (mes + 1) , ano);
		
	}
}
