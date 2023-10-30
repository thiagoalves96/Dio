package Metodos;

public class ReturnSobrecarga {

	public static double area(double lado) {
		return lado * lado;

	}

	public static double area(double base, double altura) {
		return base * altura;
	}

	public static double area(double base, double baseMenor, double altura) {

		return (double)((base + baseMenor) * altura) / 2;
	}

	

}
