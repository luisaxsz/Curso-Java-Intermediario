package FormatandoNumeros;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class FormatandoNumeros {
	public static void main(String[] args) {
		// Classe numberFormat -> Menos precisao decimal

		Locale en = new Locale("en", "United Stated");
		NumberFormat nf = NumberFormat.getInstance(en);

		String num = nf.format(200.99);
		System.out.println(num);

		Locale br = new Locale("pt", "Brazil");
		nf = NumberFormat.getInstance(br);
		num = nf.format(200.99);
		System.out.println(num);

		// Moeda
		NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		String valor = moeda.format(99.99);
		System.out.println(valor);

		Currency currency = moeda.getCurrency();
		System.out.println(currency);

		// Porcentagem
		NumberFormat porcent = NumberFormat.getPercentInstance(Locale.getDefault());
		String porcentagem = porcent.format(99.98);
		System.out.println(porcentagem);

		// Definir casas decimais
		porcent.setMinimumFractionDigits(1);
		porcent.setMaximumFractionDigits(3);
		// Definir casas inteiras
		porcent.setMaximumIntegerDigits(4);
		porcent.setMinimumIntegerDigits(3);

		porcentagem = porcent.format(999999);
		System.out.println(porcentagem);

		// Arredondamento
		nf = NumberFormat.getInstance();
		nf.setRoundingMode(RoundingMode.HALF_EVEN);
		nf.setMaximumFractionDigits(0);
		nf.setMinimumFractionDigits(1);
		System.out.println(nf.format(99.50));
		
		
	}
}
