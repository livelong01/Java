package application;

import java.util.Locale;
import java.util.Scanner;


public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];

		}
		
		System.out.print("VALORES = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		System.out.println("SOMA = "+ soma);
		System.out.println("MEDIA = "+ (soma / vetor.length));
		
		
		sc.close();
	}

}