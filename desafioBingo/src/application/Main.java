package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Contas;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Contas> bingo = new ArrayList<>();
		int numero = 0;
		System.out.print("Quantos numeros tera o Bingo? ");
		int n = sc.nextInt();
		
		
		for (int i = 1; i <=n; i++) {
			numero += 1;
			bingo.add(new Contas(numero));			
		}
		
		for (Contas x: bingo ) {
			System.out.println(x);
		}
		while (bingo.isEmpty() != true) {
		
			System.out.print("Qual numero sorteado? ");
			int sorteado = sc.nextInt();
			Contas verificador = bingo.stream().filter(x -> x.getNumeros() == sorteado).findFirst().orElse(null);
			
			while (verificador ==  null ) {
				System.out.println("Esse numero já saiu, por favor selecione outro.");
				int sorteado2 = sc.nextInt();
				verificador = bingo.stream().filter(x -> x.getNumeros() == sorteado2).findFirst().orElse(null);
				}
			boolean removedor = bingo.removeIf(x -> x.getNumeros() == sorteado); // É BOLEANO, PQ SE FOR TRUE REMOVE , FALSE N REMOVE NADA.
			
			System.out.println();
			System.out.println("Numeros restantes");
			for (Contas x: bingo ) {
				System.out.println(x);
			}
		}
		System.out.println("Todos os numeros foram sorteados!!!");
		
	}
	

}
