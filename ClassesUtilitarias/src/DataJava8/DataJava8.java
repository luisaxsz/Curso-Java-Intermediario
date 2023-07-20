package DataJava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DataJava8 {

	public static void main(String[] args) {
		// Baseada na biblioteca joda time
		// Data dd MM yyyy
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		System.out.println(LocalDate.of(2010, 2, 1));
		// String para data -
		System.out.println(LocalDate.parse("2004-02-09"));
		// Adicionar ou retirar dias
		System.out.println(agora.plusMonths(3));
		System.out.println(agora.minusDays(5));
		// Verificar dias
		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.getDayOfMonth());
		System.out.println(agora.getDayOfYear());

		// Apenas horario
		LocalTime hAgora = LocalTime.now();

		System.out.println(hAgora);
		// Definir hora
		System.out.println(LocalTime.of(20, 15));
		// String para hora - iso
		System.out.println(LocalTime.parse("12:30"));
		// Adicionar ou remover horas
		System.out.println(hAgora.plusHours(2));
		System.out.println(hAgora.minusMinutes(30));
		System.out.println(hAgora.minus(40, ChronoUnit.MINUTES));

		// Data completa
		LocalDateTime agoraCompleto = LocalDateTime.now();

		System.out.println(agoraCompleto);

		System.out.println(agoraCompleto.plusYears(20));
		
		//Zone id - local date time
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		ZoneId sp = ZoneId.of("America/Sao_Paulo");
		System.out.println(sp);
		
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto,offset);
		System.out.println(offsetdt);
		
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(),sp);
		System.out.println(ldtDate);
		
		
	}

}
