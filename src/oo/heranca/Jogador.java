package oo.heranca;

public class Jogador {
	public int vida = 100;
	public int x;
	public int y;
	
	public Jogador(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	
	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			 return true;
			 
		}else if(deltaX ==1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		}else {
				return false;
			}	
	}
	
	// aqui estou querendo dizer que: criei valor booleano andar e add nome direcao
	//se a palavra norte for igual a direção que digito no meu objeto ele soma y +1. 
	public boolean andar (Direcao direcao) {
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
	}


}
