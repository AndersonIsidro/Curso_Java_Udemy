package oo.heranca.desafio;

public class Carro {
	public final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	
	public Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA =velocidadeMaxima;
	}
	public void acelerar() {
		if(velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual +=5;
		}
		

	}
	public void frear() {
		if(velocidadeAtual>=5) {
		velocidadeAtual -=5;
		}else {
		velocidadeAtual =0;
		
	}
	}
	public String toString() {
		return "Velocidade atual: "+velocidadeAtual+"Km/h";
	}

}
