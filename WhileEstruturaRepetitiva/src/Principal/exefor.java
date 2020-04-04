//estrutura repetitiva For: 01
package Principal;

import java.util.Scanner;

public class exefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um numero");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
