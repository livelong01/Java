package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {


		/*BusinessAccount account = new BusinessAccount();
		account.getBalance(); // agora posso chamar todas as funcoes da Account.
		int a  = 123;
		String b = "jonathan";
		double c = 23.0;
		BusinessAccount account2 = new BusinessAccount(a,b,c,c);
		*/
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0 );
		
		
		//UPCASTING
		
		Account acc1 = bacc;
		acc1.getBalance();
		
		Account acc2 = new BusinessAccount(1003, "bob", 0.0, 2002.0);
		Account acc3 = new SavingsAccount(1004, "ana", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2; // tem q fazer o casting -> "(BusinessAccount)"
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; // a acc3 é savingAccount, vai dar erro.
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		
		//OVERRIDE 
		Account acc8 = new Account( 1001, "alex", 1000.0);
		acc8.withdraw(200); // nesse withdraw tinha desconto e foi descontado.
		System.out.println(acc8.getBalance());
		
		Account acc9 = new SavingsAccount(1003, "maria", 1000.0, 0.01);
		acc9.withdraw(200); // nesse por ser uma Saving account, usou o metodo sem desconto.
		System.out.println(acc9.getBalance());
		
		// usando o metodo super para repetir a funcao com alteracao de mais 2 reais de taxa.
		
		Account acc10 = new BusinessAccount(1003, "maria", 1000.0, 500.0);
		acc10.withdraw(200); // usou a formula do account - 2 reais.
		System.out.println(acc10.getBalance());
	}
	
	

}
