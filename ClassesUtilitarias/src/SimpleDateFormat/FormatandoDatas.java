package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FormatandoDatas {

	public static void main(String[] args) {
		//Padrao -> formato da data
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy  HH:mm:ss a");
		
		Calendar data = new GregorianCalendar(2010, 2 , 20, 14, 32, 25);
		
		System.out.println(sdf.format(data.getTime()));
		
		//String para data
		String minhaData = "20/02/2004";
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yy");
		try {
			Date minhaDataDate = sdf1.parse(minhaData);
			System.out.println(minhaDataDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
