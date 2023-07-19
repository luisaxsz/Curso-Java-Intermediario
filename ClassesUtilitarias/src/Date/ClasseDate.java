package Date;

import java.util.Date;

public class ClasseDate {
	public static void main(String[] args) {
		Date hoje = new Date();
		
		System.out.println(hoje);
		//Quantidade em milisegundos 1970
		System.out.println(hoje.getTime());
		//Dia do mes -> Existe uma forma melhor de fazer 
		//Depreciado
		System.out.println(hoje.getDate());
	}
}
