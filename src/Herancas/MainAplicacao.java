package Herancas;

import Metodos.PularLinha;

public class MainAplicacao {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
//		Veiculo veiculo = new Veiculo();
		
//		Upcast
		
//		Veiculo moto = new Moto();
//		Veiculo caminhao = new Caminhao();
		
//		Downcast
		
//		Caminhao caminhao2 = (Caminhao) new Veiculo();
		
		
//		sobrescrita com polimorfismo
		Veiculo[] classes = new Veiculo[] {new Caminhao(),new Moto(),new Veiculo()};
		
		for (Veiculo classe: classes) {
			
			classe.metodo1();
		}
		
		PularLinha.jumpLine(2);

		for (Veiculo classe: classes) {
			
			classe.metodo2();
		}
		
		PularLinha.jumpLine(2);
		
//		sobrescrita pura
		Caminhao caminhao = new Caminhao();
		caminhao.metodo2();
	}

}
