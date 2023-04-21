package Entities;

public class Aluno {

	public String name;
	public double nota_1;
	public double nota_2;
	public double nota_3;
	
	public double finalGrade() {
		return nota_1 + nota_2 + nota_3;
	}
}
