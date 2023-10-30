package Interface;

 class Calculadora implements OperacaoMatematica{

	@Override
	public void soma(double x, double a) {
		System.out.println("A soma: "+(x+a));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtracao(double x, double a) {
		// TODO Auto-generated method stub
		System.out.println("A subtração: "+(x-a));
		
	}

	@Override
	public void multiplicacao(double x, double a) {
		// TODO Auto-generated method stub
		System.out.println("A multiplicação: "+(x*a));
		
	}

	@Override
	public void divisao(double x, double a) {
		// TODO Auto-generated method stub
		System.out.printf("A divisão: %.2f%n",((double)x/a));
		
	}

}
