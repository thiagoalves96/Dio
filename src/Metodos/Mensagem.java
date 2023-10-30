package Metodos;

public class Mensagem {

	
	public static void bomdia (int hora) {
		if (hora >= 05 && hora < 12) {
			mensagemBomDia();
		}
	}
	public static void tarde (int hora) {
		if (hora >= 12 && hora < 17) {
			mensagemBoaTarde();
		}
	}
	public static void noite (int hora) {
		if (hora > 17 || hora < 05) {
			mensagemBoaNoit();
		}
	}
	
	
	public static void mensagemBomDia() {
		System.out.println("Bom dia!");
	}
	public static void mensagemBoaTarde() {
		System.out.println("Boa Tarde!");
	}
	public static void mensagemBoaNoit() {
		System.out.println("Boa Noite!");
	}
	
}
