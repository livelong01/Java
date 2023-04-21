package entities;

public class Product {

	private int nConta;
	private String nome;
	private double saldo;
	
	public Product(int nConta, String nome, double depositoInicial) {
		this.nConta = nConta;
		this.nome = nome;
		deposito(depositoInicial);	}
	
	public Product(int nConta, String nome) {
		this.nConta = nConta;
		this.nome = nome;
	}

	public int getnConta() {
		return nConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito (double saldo) {
		this.saldo += saldo;
	}
	
	public void saque (double saldo) {
		this.saldo -= saldo + 5.0;
	}
	
	public String toString() {
		return "Conta: " + getnConta()
				+ " Correntista: " + getNome()
				+ ", Saldo: " + String.format("%.2f%n", saldo);
	}
	
}
