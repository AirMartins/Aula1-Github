package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o c�digo da primeira pe�a");
		int codigoA = teclado.nextInt();
		System.out.println(codigoA);
		System.out.println("Digite a Quantidade de pe�as: ");
		double quantA = teclado.nextInt();
		System.out.println(quantA);
		System.out.println("Digite o valor da pe�a: ");
		double valorA = teclado.nextDouble();
		System.out.println(valorA);
		double totalA = quantA * valorA;

		System.out.println("Digite o c�digo da Segunda pe�a");
		int codigoB = teclado.nextInt();
		System.out.println("Digite a Quantidade de pe�as: ");
		double quantB = teclado.nextDouble();
		System.out.println("Digite o valor da pe�a: ");
		double valorB = teclado.nextDouble();
		double totalB = quantB * valorB;
		double total = totalA + totalB;
		System.out.printf("Valor total a Pagar: %.2f%n", total);
		teclado.close();

	}

}
