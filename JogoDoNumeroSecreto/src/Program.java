import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Pense em um numero entre 0 a 1000: ");
		System.out.println("Guarde ele na sua cabeca.");
		System.out.println("Aperte Enter quando estiver preparado(a)!");
		sc.nextLine();
		
		
		int inicio = 0;
		int fim = 1024;
		int meio = (fim + inicio)/2;
		int i = 1;
		String dica;
		
		
		System.out.println("Essa e a minha "+i + "a tentativa!");
		System.out.println("O numero pensado e " + meio + ". Estou certo? (sim/nao).");
		String resposta = sc.nextLine();
		
		
		while (!resposta.equals("sim")) {
			System.out.println("O numero e (maior/menor)?");
			dica = sc.nextLine();
			
			if (dica.equals("maior")) {
				inicio = meio + 1;
			}
			else {
				fim = meio -1;				
			}
			meio = (fim + inicio)/2;
			
			System.out.println("O numero pensado e " + meio + ". Estou certo? (sim(1)/nao(2)).");
			resposta = sc.nextLine();
			
			i += 1;
			System.out.println("Essa e a minha "+i + "a tentativa!");	
		}
		
		System.out.println("Ate a proxima!");
	}

}
