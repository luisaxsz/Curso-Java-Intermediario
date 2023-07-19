package Locale;

import java.util.Locale;

public class Internacionalização {

	public static void main(String[] args) {
		// Adapta saida de data de acordo com lugar
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		
		for (Locale loc : locales) {
			System.out.println(loc);
			System.out.println("Cod da lingua " + loc.getLanguage());
		}
		

	}

}
