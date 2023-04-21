package application;

public class Program {

	public static void main(String[] args) {


		int x = 20;
		
		Object obj = x; // BOXING
		
		System.out.println(obj); 
		
		int y = (int) obj; // UNBOXING
		
		System.out.println(y); 

	}

}
