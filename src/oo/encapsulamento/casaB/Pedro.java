package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	//como este é por heranca nao precisa criar um objeto ana 
	//basta acessar como se estivesse na mesma classe
	void testeAcessors() {
//		System.out.println(mae.segredo);
//		System.out.println(mae.facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}

}
