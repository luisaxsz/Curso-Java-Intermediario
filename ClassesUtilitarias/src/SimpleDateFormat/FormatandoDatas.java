package SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FormatandoDatas {

	public static void main(String[] args) {
		//Padrao -> formato da data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy  HH:mm:ss a");
		
		Calendar data = new GregorianCalendar(2010, 2 , 20, 14, 32, 25);
		
		System.out.println(sdf.format(data.getTime()));
		
		
		
		

	}

}
