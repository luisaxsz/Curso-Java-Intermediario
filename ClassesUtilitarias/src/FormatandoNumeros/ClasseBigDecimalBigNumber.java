package FormatandoNumeros;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;

public class ClasseBigDecimalBigNumber {

	public static void main(String[] args) {
		double a = 0.03;
		double b = 0.04;
		double c = b-a;
		System.out.println(c);
		
		//BigDecimal -> double ou float
		//BigInteger -> inteiros
		
		BigDecimal _a = new BigDecimal(0.03);
		BigDecimal _b = new BigDecimal(0.04);
		BigDecimal _c = _b.subtract(_a);
		System.out.println(_c);
		
		BigDecimal bd1 = new BigDecimal("347384738.87878");
		BigDecimal bd2 = new BigDecimal("99839283.30293203");
		System.out.println(bd1.add(bd2));
		System.out.println(bd1.multiply(bd2));
		
		BigInteger bi = new BigInteger("100000000");
		System.out.println(bi);
		System.out.println(bi.add(bi));
	}

}
