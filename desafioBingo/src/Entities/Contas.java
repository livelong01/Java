package Entities;

public class Contas {

	private Integer numeros;

	public Contas(Integer numeros) {
		this.numeros = numeros;
	}

	public Integer getNumeros() {
		return numeros;
	}

	public void setNumeros(Integer numeros) {
		this.numeros = numeros;
	}
	
	public String toString() {
		return "Numeros disponiveis: " + getNumeros();
	}
}
