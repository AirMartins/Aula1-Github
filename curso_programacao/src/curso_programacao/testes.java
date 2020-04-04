package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class testes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		 System.out.println("Digite o 1 valor de soma: ");
		 double  valorSoma = teclado.nextDouble();
		 System.out.println("Digite o 2 valor de soma ");
		 double valor= teclado.nextDouble();
		 double t= valorSoma+valor;
		 System.out.printf("A Soma dos valores "+valorSoma+" + "+ valor+ " = %.0f ",t);
		  
		
		
		
		
		
		
		
		teclado.close();
	}
}