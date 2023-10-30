package EstruturaPoo;


public class MainCarro {

	public static void main(String[] args) {

		Carro1 carro1 = new Carro1("Vermelho", "Civic", 50);

		carro1.isLigar();
		carro1.abastecerTanque(30);
		carro1.setAcelerar(30);
//		 carro1.abastecerTanque(50);
		
//		 
		carro1.mensagemCarro();
		carro1.setFreiar(5);
		carro1.mensagemCarro();
//		 carro1.isDesligar();
//		 carro1.setAcelerar(10);

	}

}
