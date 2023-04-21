import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int N = sc.nextInt();
		
		
		String[] name = new String[N], email = new String[N];
		int[] room = new int[N];
		String[] rooms = new String[10];
		
		for (int i = 0; i < N; i++ ) {
			System.out.println("Rent #" + (1+i));
			System.out.print("Name: ");
			sc.nextLine();
			name[i] =  sc.nextLine();
			System.out.print("Email: ");
			email[i] = sc.nextLine();
			System.out.print("Room: ");
			room[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Busy Rooms: ");
		for (int i = 0; i < N; i++ ) {
				rooms[room[i]] = name[i] + ", " + email[i];
		}
		
		for (int i = 0; i < 10; i++ ) {
			if(rooms[i] != null) {
				System.out.println((i)+": " + rooms[i]);
			}
	}
		
		sc.close();
	}

}
