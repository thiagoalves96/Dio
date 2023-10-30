package Metodos;

public class ExercicioSobreCarga {

	public static void area(double lado) {
		double quadrado = lado * lado;
		System.out.printf("\nA área do quadrado é: %.2f", quadrado);
	}

	public static void area(double base, double altura) {
		if (base == altura) {
			System.out.println("Valores iguais leve a conta ao quadrado");
		} else {
			double retangulo = base * altura;
			System.out.printf("\nA área do retangulo tem: %.2f", retangulo);
		}
	}

	public static void area(float diagonal1, float diagonal2) {
		double losango = (diagonal1 * diagonal2) / 2;
		System.out.printf("\nA área do losango tem: %.2f", losango);
	}

	public static void area(double base, double baseMenor, double altura) {
		double trapezio = ((base + baseMenor) * altura) / 2;
		System.out.printf("\nA área do trapezio é: %.2f", trapezio);
	}
}
