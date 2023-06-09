import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {


		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); 
		LocalDateTime d07 = LocalDateTime.parse("2018-06-21T13:05:44");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		// conversao / formatos
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt6 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // o instant tem q instanciar o FUSO HORARIO senao n roda.
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		// resultado
		System.out.println("D04 = " + d04.format(fmt1)); // com o .format, ele imprime no formato BR.
		System.out.println("D04 = " + fmt1.format(d04)); // pode chamar pela variavel data ou pelo formato.
		System.out.println("D04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // Ou no lugar do fmt1, voce pode instanciar o obj sem criar variavel.
		System.out.println("D05 = " + d05.format(fmt1)); // a data contem min, mas ele ignora e imprime no formato fmt1 ( sem hora)
		System.out.println("D05 = " + d05.format(fmt2)); // imprime com a hora.
		// a conversao muda a hora e data para o horario do brasil. 
		System.out.println("d06 = " + fmt3.format(d06)); // nesse caso ele converte a data e hora para o horario de SP, pois a hora dada estava com "Z" DE LONDRES.
	// é necessario começar com "fmt3" para poder instanciar o d06, que +e Instant e n pode chamar o .format
		System.out.println("d05 = " + fmt4.format(d05));
		
		System.out.println("d06 = " + fmt5.format(d06));
		// LEMBRANDO QUE PARA IMPRIMIR NO FORMATO ISO, PODE APENAS INSTNANCIAR O "TOSTRING" ex:
		System.out.println("d06 = " + d06.toString());
		
		System.out.println(d07.format(fmt6));

	}

}
