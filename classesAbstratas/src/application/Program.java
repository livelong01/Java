package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//Account acc1 = new Account(1001, "Alex", 1000.0); da erro, por causa do ABSTRACT
		
		//System.out.println(acc1.getBalance());
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Ana", 500.0, 500.0));
		
		double sum = 0.0;
		
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
	
		for (Account acc: list ) {
			acc.deposit(10.0);
		}
		
		for (Account acc : list ) {
			System.out.println(acc.getHolder() +" Balance: " + acc.getBalance());
		}
		
		
	
	}
}
