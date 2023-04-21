package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product prod;
		
		System.out.print("Entre com o numero da conta: ");
		int nConta = sc.nextInt();
		System.out.print("Entre com o nome do cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Fara um deposito ininical? (s/n) ");
		char resposta = sc.next().charAt(0);
		
		
		if (resposta == 'S' || resposta == 's') {
			System.out.print("Entre com o valor de deposito incial: ");
			double depositoInicial = sc.nextDouble();
			prod = new Product(nConta,nome,depositoInicial);
		}
		else {
			prod = new Product(nConta,nome);
		}
		
		System.out.println();
		
		System.out.println("Dados da conta: ");
		System.out.print(prod);
	
		System.out.println();
		
		System.out.print("Entre com o valor do deposito: ");
		double saldo = sc.nextDouble();
		prod.deposito(saldo); 
		System.out.println("Dados atualizados da conta: ");
		System.out.print(prod);
		
		System.out.println();
		
		System.out.print("Entre com o valor do Saque: ");
		saldo = sc.nextDouble();
		prod.saque(saldo);
		System.out.println("Dados atualizados da conta: ");
		System.out.print(prod);
		
		
		sc.close();
	}

}
