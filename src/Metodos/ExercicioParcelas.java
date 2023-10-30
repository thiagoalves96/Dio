package Metodos;

public class ExercicioParcelas {

	public static double getTaxaDuasParcela() {

		return 0.3;
	}

	public static double getTaxaTresParcela() {

		return 0.45;
	}

	public static void calcular(double valor, int parcelas) {
		if (parcelas == 2) {
			double valorFinal = valor + (valor * getTaxaDuasParcela());

			System.out.println("O valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
		} else if (parcelas == 3) {

			double valorFinal = valor + (valor * getTaxaTresParcela());

			System.out.println("O valor final do empréstimo para 3 parcelas: R$ " + valorFinal);

		} else {
			System.out.println("A quantidade de parcelas não aceita.");
		}

	}
}
