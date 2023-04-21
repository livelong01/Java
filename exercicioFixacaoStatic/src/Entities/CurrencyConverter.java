package Entities;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	public static double dolarP;
	public static double dolarB;
	
	public static double reais() {
		return (dolarB + (dolarB*IOF)) * dolarP;
	}
}
