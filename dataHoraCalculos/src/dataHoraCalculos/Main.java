package dataHoraCalculos;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
	
		//Instanciado uma nova data, que é o D04 - 7 dias.
		LocalDate pastWeekLocalDate = d04.minusDays(7);  
		// Instanciado uma nova data, que é o d04 + 7 dias.
		// voce pode mudar anos, meses, dias. etc.
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		// PRINT
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("NextWeekLocalDate = " + nextWeekLocalDate);

		//Instanciado uma nova data, que é o D04 - 7 dias.
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);  
		// Instanciado uma nova data, que é o d04 + 7 dias.
		// voce pode mudar anos, meses, dias E HORAS, MINUROS, SEGs ETC.
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		
		//Instanciado uma nova data, que é o D04 - 7 dias.
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);  
		// Instanciado uma nova data, que é o d04 + 7 dias. NESSE CASO USA O "CHRONOuNIT. ..."
		// voce pode mudar anos, meses, dias E HORAS, MINUROS, SEGs ETC.
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);		
	
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
	
	
	/* CALCULO DA DURACAO
	 * PRESTAR ATENCAO
	 * NISSO!
	 */
	
		
		//Duraçao do tempo entre os dias pastweek ate o dia d05.
		// pode usar o atStartofDay para indicar o inicio do dia, ou usar o atTime( 0,0) e editar caso a hora do dia seja diferente do inicio do dia.
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0 , 0)); // DA ERRO TEM Q SER CONVERTIDO PARA LOCALDATETIME COM HORAS  min E SEG. E precisa por das 0 horas ate as 0 horas.
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		// inverter a hora, para o dia maior para o dia menor.
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays()); // DEU 7 DIAS DE DURACAO ENTRE AS DATAS.
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		// data ao contrario // da um resultado negativo. -7 dias
		System.out.println("t4 dias = " + t4.toDays());
		
		
	}

}
