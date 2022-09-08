package Classe;

public class DataTestte {
	public static void main(String[] args) {
		Data n1 = new Data();
	
		Data n2 = new Data();
		n2.dia = 12;
		n2.mes = 01;
		n2.ano = 2013;
		
		Data n3 = new Data(22,7,2005);
		
		
		System.out.println(n1.obterData());
		System.out.println(n2.obterData());
		
		System.out.printf("dia= %d \n mes= %d \n ano= %d\n",n3.dia, n3.mes, n3.ano);
		
		n1.imprimirData();
		
		
		
	}

}
