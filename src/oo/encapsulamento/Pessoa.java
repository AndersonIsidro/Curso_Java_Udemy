package oo.encapsulamento;

public class Pessoa {
	private int idade;
	//construtor para que posso acrescentar a idade direto ao objeto
	public Pessoa(int idade) {
		this.idade = idade;
	}
	//metodo gettter para apenas retornar o valor de idade sem que alguem possa alterar na classe
	public int lerIdade() {
		return idade;
	}
	//esse debaixo metodo settter consigo alterar idade sem acionar ela
	public void alterarIdade(int novaIdade) {
		this.idade = novaIdade;
	}

}
