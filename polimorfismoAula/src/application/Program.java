package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account x = new Account (1020, "alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	/*
	 * RESUMO: O polimorfismo voce pode usar a mesma classe, por ex "Account" e 
	 * chamar a mesma funcao, no caso "withdraw" e estas vao se comportar de forma diferente.
	 * Isso pq elas foram instanciadas como Account e SavingsAccount, onde o metodo do 
	 * withdraw tem comportamentos diferentes. 
	 */
	
	}
}
