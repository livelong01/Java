package entities;

public class Triangule {
	
	public double a;
	public double b;	
	public double c;
	
	// só vai adc algo no parenteses se a variavel n for citada
	// acima, nesse caso tudo q precisa foi citado (a,b,c).
	public double area() {
		double p = (a + b+ c)/ 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));

		
	}
}
