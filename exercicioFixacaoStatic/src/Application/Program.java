package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?");
		CurrencyConverter.dolarP = sc.nextDouble();
		
		System.out.print("How many dollars will be Bought? ");
		CurrencyConverter.dolarB = sc.nextDouble();
		
		System.out.printf("Amont to be paid in reais = " + String.format("%.2f", CurrencyConverter.reais()));
		
	
		sc.close();
	}

}
