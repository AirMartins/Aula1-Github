package principal;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Número: ");
		int a = sc.nextInt();
		System.out.println("Digite o Número: ");
		int b = sc.nextInt();
		if (a % b == 0 || b % a == 0) {
			System.out.println("São Múltiplo");

		} else {
			System.out.println("Não São Múltiplos");

		}
		sc.close();

	}
}
