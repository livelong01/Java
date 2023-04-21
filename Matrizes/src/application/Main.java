package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Tamanho da matriz quadrada? ");
		int N = sc.nextInt();
		
		int[][] mat = new int[N][N];  
		
		System.out.println(" Digite os numeros da matriz: ");
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Main Diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		int cont = 0;
		System.out.println();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) { // para ter a coluna tem q usar o Mat[i].legth
				if (mat[i][j] < 0) {
				cont ++;
				}
			}
		}
		System.out.print("Negative Numbers = " + cont);
		sc.close();
	}

} 
