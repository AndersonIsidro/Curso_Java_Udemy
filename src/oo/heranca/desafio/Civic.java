package oo.heranca.desafio;

public class Civic extends Carro implements Esportivo{

	public Civic (){
		super(212) ;
	}
	public void acelerar() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
	
	}
	@Override
	public void ligarTurbo() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
		super.acelerar();
		super.acelerar();
		
	}
	@Override
	public void desligarTurbo() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}
}
