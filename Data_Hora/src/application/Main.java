package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
	// SITE DO DATE FORMATTER
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		LocalDate d01 = LocalDate.now(); // data sem horario
		LocalDateTime d02 = LocalDateTime.now(); // data e hora com fracao de segundos
		Instant d03 = Instant.now(); // data e hora de Londres ( Padronizada )
		LocalDate d04 = LocalDate.parse("2023-04-15");
		LocalDateTime d05 = LocalDateTime.parse("2023-04-15T01:30:26");
		Instant d06 = Instant.parse("2023-04-15T01:30:26Z"); // gera a hora no horario de londres.
		Instant d07 = Instant.parse("2023-04-15T01:30:26-03:00"); // converte o horario zulu para o brasileiro. -3
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); //USOU O FMT1 formato criado acima!!!
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		LocalDateTime d10 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")); // Instanciou A FORMATACAO dentro do proprio localdate
		
		LocalDate d11 = LocalDate.of(2022, 7, 20); // para vc escolhar a data com ano, mes e dia.
		LocalDateTime d12 = LocalDateTime.of(2022, 7, 20, 1, 30); // nesse voce seleciona o ano, mes, dia hora e  min. Mas tem outras sobrecargas.
		
		
		System.out.println("d01 = " + d01.toString()); // O to string esta embutido no formato date, nao precisa usar ele e ele ja mostra um texto.
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08); // ele imprime no formato ISO, MESMO INSTANCIANDO NO FORMATO PADRAO BR.
		System.out.println("d09 = " + d09); // agora a mesma conversao ao ISO, mas com Hora.
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		System.out.println("d12 = " + d12);
	}

}
