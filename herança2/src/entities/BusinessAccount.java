package entities;

public class BusinessAccount extends Account{ // extends cria a herança

	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
		balance += amount - 10; // chama a funcao deposit, pq pegar emprestado é a mms coisa de receber um dinheiro em deposito.
	}	
	}
	
	@Override // com isso consigo reutilizar a formula do withdraw do account, porem descontando mais 2.
	public void withdraw (double amount) {
		super.withdraw(amount);
		balance-= 2.0;
	}
}
