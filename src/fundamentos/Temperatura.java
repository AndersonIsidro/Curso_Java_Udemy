package fundamentos;

public class Temperatura {
	public static void main(String[] args) {		
	// (°F - 32) x 5/9 = °C
		final double ajuste = 32 ;
		final double fator = 5/9.0;
		
		double farenheit = 86 ;		
		double celsius = (farenheit - ajuste)* fator;
		System.out.println(celsius + "°C"); //para mover uma linha de codigo segura alt e seta pra cima ou baixo
		
		farenheit = 150;
	    celsius = ( farenheit - ajuste) * fator;
		System.out.println(celsius + "°C"); //para duplicar a mesma linha ctrl alt e seta pra cima ou baixo
		
		
		
	}
}
