package FormatandoNumeros;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ClasseDecimalFormat {

	public static void main(String[] args) {
		//Mais controle na formatação
		//Classe filha da numberFormat
		//Possui padrões
		// # -> define o numero
		// 0 Aparece 
		String padrao = "###,###.##";
		DecimalFormat  df = new DecimalFormat(padrao);
		System.out.println(df.format(123455677.12));
		
		//Ponto milhares 
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("en", "United Stated"));
		dfs.setDecimalSeparator('.');
		dfs.setGroupingSeparator(',');//milhares
		
		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2,dfs);
		System.out.println(df.format(37637232.32323));
		
		
		
		//Sem parametros
		//DecimalFormat df2 = new DecimalFormat();
		//De acordo com localização
		//df2.applyLocalizedPattern();
		
		

	}

}
