package VisibilidadeModificadoresDeAcesso2;

import VisibilidadeModificadoresDeAcesso.Classe1;

class Classe4 {
	
	Classe1 classe1;
	void metodo() {
	classe1.atributo3="Public";
	
	classe1.metodo3();//public
	}

}
