package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		final double pi = 3.14159;//final vira uma variavel fixa nao modificavel

		double area = pi * raio * raio;

		System.out.println(area); // syso -- atalho para formula
		
		raio = 10;
		area = pi * raio * raio;
		System.out.println("Area = " + area + " m2");
	}
}
