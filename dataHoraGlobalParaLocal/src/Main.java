import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {


		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		// conversao global para local.
		// para conhecer todas as timezones, voce pode fazer um for
		
		//for (String s :  ZoneId.getAvailableZoneIds()) {
			//System.out.println(s);
		//}
		
		// vou converter o instante D06, para a data/hora local, considerado o fuso horario da minha maquina (sysDefault)
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		//impressao
		System.out.println("r1 = " + r1 ); // hora local
		System.out.println("r2 = " + r2 ); // em Portugal
		System.out.println("r3 = " + r3 ); // No Brasil/Local com hora tambem
		System.out.println("r4 = " + r4 ); //em Portugal com hora tambem
		
		// outras formas de pegar partes da data/hora
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mes = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d05 ano = " + d05.getHour());
		System.out.println("d05 ano = " + d05.getMinute());

	}

}
