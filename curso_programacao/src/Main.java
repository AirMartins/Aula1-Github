import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.print("Ol� Mundo! ");
		System.out.println("Bom Dia ");
		int y=32;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		double x = 10.35784;
		
		System.out.println("a vari�vel Y cont�m " + y  + " e vari�vel x " + x);// s�mbolo de + neste caso para concatena��o
		System.out.printf("%.2f%n", x);// %n tem o mesmo efeito de \n de quebra de linha, 
		System.out.printf("%.4f%n", x);// o numero neste caso o 4 dita quantas casa decimais ir� imprimir
		Locale.setDefault(Locale.US);//comando de localiza��o do app, aqui ir� tirar a v�gula e por o ponto, padr�o US
		System.out.printf("%.4f%n", x);
		System.out.printf("RESULTADO = %.2f metros%n", x);
		//%f = ponto flutuante,	%d = inteiro, %s = texto, %n = quebra de linha
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}

}
