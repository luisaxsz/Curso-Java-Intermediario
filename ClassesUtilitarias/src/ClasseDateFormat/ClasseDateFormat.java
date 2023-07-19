package ClasseDateFormat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class ClasseDateFormat {

	public static void main(String[] args) {
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		//Definir formato de outro local
		Locale.setDefault(new Locale("en", "US"));
		//Formatar data de acordo com o locale
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		//GetInstance
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);
		
		
	}

}
