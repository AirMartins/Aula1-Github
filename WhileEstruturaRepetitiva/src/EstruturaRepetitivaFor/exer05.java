/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por defini��o, fatorial de 0 � 1.
Exemplos:
Entrada: Sa�da:
4          24
Entrada: Sa�da:
1          1
Entrada: Sa�da:
5        120
Entrada: Sa�da:
0          1  */
package EstruturaRepetitivaFor;

import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}
}
