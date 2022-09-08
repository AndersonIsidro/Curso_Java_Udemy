package oo.heranca.Testes;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Monstro j1 = new Monstro();
		j1.x = 10;
		j1.y = 10;
		
		Heroi j2 = new Heroi(10,11);
		
		System.out.println("Monstro 1 "+j1.vida);
		System.out.println("Heroi 2 "+j2.vida);
		j2.atacar(j1);
		j1.atacar(j2);
		j1.atacar(j2);
		System.out.println("Monstro 1 "+j1.vida);
		System.out.println("Heroi 2 "+j2.vida);
		
	}

}
