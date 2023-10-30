package EstruturaPoo;

public class Carro1 {
	String cor;
	String modelo;
	int capacidadeTanque;
	int abastecerTanque=0;
	int acelerar;
	boolean ligar;

	public Carro1(String cor, String modelo, int capacidadeTanque) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
		
	}

	public boolean isLigar() {
		return ligar = true;
	}

	public boolean isDesligar() {
		return ligar = false;
	}

	public void abastecerTanque(int abastecerTanque) {
		if (abastecerTanque > capacidadeTanque) {
			System.out.println("Error! Quantidade maior que a capacidade 50l.");
		} else {
			this.abastecerTanque = abastecerTanque;
		}
	}

	public void setAcelerar(int acelerar) {
		if (ligar == true && this.abastecerTanque > 0) {
			if (acelerar > 10) {
			for (int i = 10;i < acelerar;i=i+10) {
				this.abastecerTanque -= 1;
			}
			this.acelerar = acelerar;
			}else {
				this.acelerar = acelerar;
				
			}
		} else {
			System.out.println("Verifique o tanque ou se o carro está ligado.");
			this.acelerar = 0;
			acelerar=0;
		}
	}

	public void setFreiar(int acelerar) {
		if (ligar == true || abastecerTanque > 0) {
			this.acelerar -= acelerar;
		} else {
			System.out.println("Verifique se o carro está ligado.");
	         acelerar=0;
		}
	}

	public void mensagemCarro() {
		System.out.println("Carro1 [cor=" + cor + ", modelo=" + modelo + ", Nivel do tanque Atual=" + abastecerTanque
				+ ", capacidade do Tanque=" + capacidadeTanque + ", acelerar=" + acelerar + ", ligado =" + ligar + "]");
	}

}
