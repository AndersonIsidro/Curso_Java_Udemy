package oo.heranca.Testes;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Esportivo;
import oo.heranca.desafio.Tiguan;

public class CarroTeste {
	public static void main(String[] args) {

	Carro fusca = new Carro(50);
	System.out.println("fusca "+fusca.toString());
	Civic civic = new Civic();
	System.out.println("civic "+civic.toString());
	Carro tiguan = new Tiguan();
	System.out.println("tiguan "+tiguan.toString());
	
	fusca.acelerar();
	civic.acelerar();
	civic.ligarTurbo();
	tiguan.acelerar();
	System.out.println("\nacelerei fusca "+fusca.toString());
	System.out.println("acelerei civic "+civic.toString());
	System.out.println("acelerei tiguan "+tiguan.toString());
	
	fusca.frear();
	civic.frear();
	tiguan.frear();
	System.out.println("\nacionei o freio fusca "+fusca.toString());
	System.out.println("acionei o freio civic "+civic.toString());
	System.out.println("acionei o freio tiguan "+tiguan.toString());

	
	}
}
