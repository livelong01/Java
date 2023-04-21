package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static final double PI = 3.14159; // CONSTANTE SEMPRE COM LETRAS MAIUSCULAS
	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc =  new Scanner(System.in);
			
			System.out.print("Enter radius: ");
			double radius = sc.nextDouble();
			
			double c = circumference(radius);
			
			double v = volume(radius);
			
			System.out.printf("Circuference: %.2f%n", c);
			System.out.printf("Volume: %.2f%n", v);
			System.out.printf("Pi value: %.2f%n", PI);
			
			sc.close();
	}
	
	public static double circumference(double radius) {
		return 2* PI * radius;
	}
	public static double volume(double radius) {
		return 4.0* PI * Math.pow(radius,3)/3.0;
	}
	
	
}