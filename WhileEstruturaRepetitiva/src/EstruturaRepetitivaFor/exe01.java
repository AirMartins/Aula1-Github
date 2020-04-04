package EstruturaRepetitivaFor;

import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um Valor");
		int num = sc.nextInt();
		// estrutora repetitiva usando For a variavel i e o contador e mostra na tela ao
		// usuário
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);

			}

			sc.close();
		}
	}
}
