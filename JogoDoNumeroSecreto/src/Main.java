import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Pense em um numero entre 0 à 1000: ");
		int objetivo = sc.nextInt();
		
		int inicio = 0;
		int fim = 1024;
		int meio = (fim + inicio)/2;
		int i = 0;
		
		while ( objetivo != meio ) {
			if (objetivo > meio) {
				System.out.println(meio);
				System.out.println("Dica: Maior");
				inicio = meio + 1;
			}
			else {
				System.out.println(meio);
				System.out.println("Dica: Menor");
				fim = meio -1;				
			}
			meio = (fim + inicio)/2;
			
			i += 1;
			System.out.println(i + "a tentativa!");	
		}
		System.out.println("O numero pensado é " + meio);
	}

}
