package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioScanner {
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	

	System.out.print("primeiro salario:");
	String primeiro = entrada.nextLine().replace(",", ".");
	
	System.out.print("segundo salario:");
	String segundo =  entrada.nextLine().replace(",", ".");
	
	
	System.out.print("terceiro salario:");
	String terceiro= entrada.nextLine().replace(",", ".");
	
	double salario1 = Double.parseDouble(primeiro);
	double salario2 = Double.parseDouble(segundo);
	double salario3 = Double.parseDouble(terceiro);
	
	double media= (salario1+salario2+salario3) /3;
	System.out.println("A media dos salarios é"+media);
	
	
	entrada.close();
	}

}
