package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz c1 = new Arroz(0.25);
		Feijao c2 = new Feijao(0.15);
		Sorvete c3 = new Sorvete(0.25);
		System.out.println(convidado.getPeso());
		convidado.comer(c1);
		convidado.comer(c2);
		convidado.comer(c3);
		System.out.println(convidado.getPeso());
		convidado.setPeso(100);
		convidado.comer(c3);
		System.out.println(convidado.getPeso());
		
	}

}
