package application;

public class wrapper {

	public static void main(String[] args) {


		int x = 20;
		
		Integer obj = x; // wrapper MUDA OBJEXT PARA INTEGER
		
		System.out.println(obj); 
		
		int y = obj * 2; // com isso nao precisa usar mais o (int).
		
		System.out.println(y); 

	}

}
