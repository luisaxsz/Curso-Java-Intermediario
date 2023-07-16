package StaticImport;

import static java.lang.Math.pow; 
import static java.lang.Math.sqrt; 

//Nao e muito utilizado assim
//import static java.lang.Math.*;

public class StaticImport {

	public static void main(String[] args) {
		double a = 2;
		double b = 3;
		double c = 4;
		//Metodos Estaticos 
		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(c));
		
		//Metodo Estatico
		System.out.println(pow(a,b));
		
	}

}
