package EstruturaRepetitivaFor;


import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
package EstruturaRepetitivaFor;
Entrada    sa�da
3         -1.5
3 -2       divisao impossivel 
-8 0       0.0
0 8

divisao impossivel
0.0
Exerc�cio*/

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero de Repeti��o");
		int num = sc.nextInt();
		 for (int i=0; i<num; i++) {
			 System.out.println("digite o valor");
			 double a=sc.nextDouble();
			 System.out.println("digite o segundo valor");
			 double b=sc.nextDouble();
			 if (b==0) {
				 System.out.println("divis�o imposs�vel");
			 }
			 else {
				 
				 double result= a/b;
				 System.out.println(result);
			 }
			 
		 }
     sc.close();
	}

}