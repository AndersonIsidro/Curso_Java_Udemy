package Classe;

public class PrimeiroTrauma {
	int a = 3;// sem o static precisa criar um objeto para acessar a variavel
	static int b = 4;//com static nao precisa criar objeto para acessar o membro antes da classe
	
	public static void main(String[] args) {
		PrimeiroTrauma p1 = new PrimeiroTrauma();
		System.out.println(p1.a);
		
		System.out.println(b);
		
	}

}
