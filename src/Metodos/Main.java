package Metodos;

public class Main {

	public static void main(String[] args) {

		// Mensagem metodo
		System.out.println("Exercicio Hora:");
		Mensagem.bomdia(9);
		Mensagem.tarde(14);
		Mensagem.noite(23);
		PularLinha.jumpLine(4);
		// Emprestimo metodo
		System.out.println("Emprestimo:");
		ExercicioParcelas.calcular(1000, 3);
		ExercicioParcelas.calcular(1000, 2);
		ExercicioParcelas.calcular(1000, 4);
		PularLinha.jumpLine(2);
		// Calculadora metodo
		System.out.println("Exercicio Calculadora:");
		ExercicioCalculadora.soma(23, 20);
		ExercicioCalculadora.subtracao(33, 40);
		ExercicioCalculadora.multiplicacao(23, 12);
		ExercicioCalculadora.divisao(54, 59);
		PularLinha.jumpLine(3);
		// metodo Sobrecarga
		System.out.print("Sobrecarga:");
		ExercicioSobreCarga.area(4);
		ExercicioSobreCarga.area(5d, 4d);
		ExercicioSobreCarga.area(4, 5, 4);
		ExercicioSobreCarga.area(4f, 4f);
		// return
		PularLinha.jumpLine(2);
		System.out.println("Return:");
		double quadrado = ReturnSobrecarga.area(2.0);
		System.out.println(quadrado);
		double retangulo = ReturnSobrecarga.area(2.0,9.0);
		System.out.println(retangulo);
		double trapezio = ReturnSobrecarga.area(2.0,4.0,5.0);
		System.out.println(trapezio);
		

	}

}
