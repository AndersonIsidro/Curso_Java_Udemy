package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//TRABALHO NA TERÇA (V OU F)
		// TRABALHO NA QUINTA (V OU F)
		
		
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		boolean comproutv50 = trabalho1 && trabalho2;
		boolean comproutv32 = trabalho1 ^ trabalho2;
		boolean tomousorvete = trabalho1 || trabalho2;
		
		System.out.println("comprou tv de 50\"?" + comproutv50);
		System.out.println("comprou tv de 32\"?" + comproutv32);
		System.out.println("comprou sorvete\"?" + tomousorvete);
		
		
		//operador unário  
		System.out.println("mais saudavel\"?" +!tomousorvete);
		
		
		
		
		
		
		
		
	}
	
	

}
