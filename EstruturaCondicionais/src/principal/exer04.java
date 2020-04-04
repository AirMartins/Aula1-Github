package principal;

import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite hora início do jogo");
		double inicio = sc.nextDouble();

		if (inicio > 24 || inicio < 0) {
			System.out.println("hora inválida");
			
			
		} else {
			System.out.println("Digite hora fim do jogo");
			double fim = sc.nextDouble();
			double total = 24 - inicio+fim;
			System.out.println("Tempo de jogo, Horas:"+ total);

		}
		sc.close();
	}
}
