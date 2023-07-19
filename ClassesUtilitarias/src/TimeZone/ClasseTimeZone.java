package TimeZone;

import java.util.Calendar;
import java.util.TimeZone;

public class ClasseTimeZone {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		TimeZone tz = calendar.getTimeZone();
		System.out.println(tz);
		
		//Configura fuso horario
		TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");
		System.out.println(tzSP.getDisplayName());
		System.out.println(tzSP.getID());

	}

}
