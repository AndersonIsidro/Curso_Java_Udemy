package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		
	
	Pessoa p1 = new Pessoa(30);
	System.out.println(p1.lerIdade());
	p1.alterarIdade(45);
	System.out.println(p1.lerIdade());
	

}}
