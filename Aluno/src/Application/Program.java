package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno al = new Aluno();
		
		System.out.print("Nome do aluno: ");
		al.name = sc.nextLine();
		System.out.print("Nota 1: ");
		al.nota_1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		al.nota_2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		al.nota_3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Final Grade = "+ al.finalGrade());
		
		if (al.finalGrade()>= 60) {
			System.out.println("PASS");
		}
		else {
			double missing = Math.abs(al.finalGrade()-60);
			System.out.println("Failed");
			System.out.println("Missing "+ String.format("%.2f", missing) + " Points" );
		}
		sc.close();

	}

}
