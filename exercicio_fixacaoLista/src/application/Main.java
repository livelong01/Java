package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		List<Integer> lista = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Informe o "+(i+1)+ ".o valor: ");
			int valor = sc.nextInt();
			lista.add(valor);
		
		}
		System.out.println();
		System.out.println("Conteudo do Array List");
		
		for (Integer x: lista) {
			System.out.println(x);
		}
	}
	

}
