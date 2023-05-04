package application;

import java.util.Scanner;

import entities.Quartos;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Quartos[] quarto = new Quartos[10];
		
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			
			
			quarto[room] = new Quartos(name, email);	
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (quarto[i] != null) {
				System.out.println((i) + ": "+ quarto[i]);
			}
			
		}
		
		sc.close();
	}

}
