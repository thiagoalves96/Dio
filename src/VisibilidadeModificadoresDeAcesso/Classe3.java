package VisibilidadeModificadoresDeAcesso;

class Classe3 {
	
	Classe1 classe1;
	
	void metodo() {
		classe1.atributo2="Protegido";
		classe1.atributo3="Publico";
		classe1.metodo2();
		classe1.metodo3();
	}
	

}
