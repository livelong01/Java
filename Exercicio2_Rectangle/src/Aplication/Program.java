package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        Rectangle rectangle;  // criar uma variavel com o rectangle"
		rectangle = new Rectangle(); // criar uma nova classe para usa-la aqui
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble(); // agora ja pode usar ela para chamar a funcao.
		rectangle.height = sc.nextDouble();

		System.out.println();
		System.out.println(rectangle);
		
		
		
		sc.close();
	}

}