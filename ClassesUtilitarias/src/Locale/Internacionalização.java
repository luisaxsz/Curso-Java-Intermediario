package Locale;

import java.text.NumberFormat;
import java.util.Locale;

public class Internacionalização {

	public static void main(String[] args) {
		// Adapta saida de data de acordo com lugar
		//Pode passar como parâmetro pais e linguagem
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		
		for (Locale loc : locales) {
			System.out.println(loc);
			System.out.println("Cod da lingua " + loc.getLanguage());
		}
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		System.out.println(nf1.format(400));
		
		

	}

}
