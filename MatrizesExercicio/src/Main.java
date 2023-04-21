import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qtd de Linhas e colunas da Matriz: ");
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] mat = new int[N][M];
		
		System.out.println("Digite os numeros da matriz: ");
		
		for (int i = 0; i <mat.length; i ++ ) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.print("Numero a ser buscado: ");
		int buscado = sc.nextInt();
		
		for (int i = 0; i <mat.length; i ++ ) {
			for (int j = 0; j < mat[i].length; j++) {
				if (buscado == mat[i][j]) {
					System.out.println( "Position "+i + "," + j+":"); 
					
					if (j>0) {
					System.out.println("Left: " + mat[i][j-1]);
					}
					if (j < mat[i].length-1) {
					System.out.println("Right: " + mat[i][j+1]);
					}
					if ( i > 0) {
					System.out.println("Up: " + mat[i-1][j]);
					}
					if (i < mat.length-1) {
					System.out.println("Down: " + mat[i+1][j]);
					}
				}
				
			}
			System.out.println();
		}
	}

}
