package GregorianCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClasseGregorianCalendar {

	public static void main(String[] args) {
		// Sub classe da classe calendar
		// Possui metodos diferentes da classe Calendar
		GregorianCalendar hoje = new GregorianCalendar();

		imprimirData(hoje);
		
		// Ano bissexto
		System.out.println("");
		System.out.println(hoje.isLeapYear(2017));

	}

	private static void imprimirData(Calendar hoje) {
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);

		System.out.printf("Hoje e: %d/%d/%d", dia, (mes + 1), ano);
	}

}
