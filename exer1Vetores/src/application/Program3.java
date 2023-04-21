package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Product[] pessoa = new Product[n];
		
		for (int i = 0; i < pessoa.length; i++) {
			System.out.println("Dados da "+ (i+1) +"a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoa[i] = new Product(nome, idade, altura);
		}
		double soma = 0;
		int cont = 0;
		for (int i = 0; i < pessoa.length; i++) {
			soma += pessoa[i].getAltura();
			if (pessoa[i].getIdade() < 16) {
				cont += 1;
			}
		}
		double media = soma / pessoa.length;
		System.out.println("Altura media: " + String.format("%.2f", media));
		double porcmenores = 0.0;
		porcmenores = ((double)cont/pessoa.length)*100.0;
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", porcmenores)+ "%" );
		
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}
		
		sc.close();
	}

}
