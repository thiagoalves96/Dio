package Metodos;

public class ExercicioCalculadora {
	
	public static void soma (double numero1,double numero2) {
		
		double resultadoSoma = numero1 + numero2;
		
		
		System.out.println("A soma de "+numero1+" mais "+numero2+" é: "+resultadoSoma);
		
	}
	
	
	public static void subtracao (double numero1,double numero2) {
		
		double resultadoSub = numero1 - numero2;
		
		
		System.out.println("A subtração do "+numero1+" mais "+numero2+" é: "+resultadoSub);
		
	}
	
	
	public static void multiplicacao (double numero1,double numero2) {
		
		double resultadoMult = numero1 * numero2;
		
		
		System.out.println("A multiplicação de "+numero1+" mais "+numero2+" é: "+resultadoMult);
		
	}
	public static void divisao (double numero1,double numero2) {
		
		double resultadoDiv = numero1/numero2;
		
		
		System.out.printf("A divisão de "+numero1+" mais "+numero2+" é: %.2f",resultadoDiv);
		
	}
	
	

}
