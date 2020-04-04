package Principal;

import java.util.Scanner;

public class teste01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		int num = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= num; i++) {
			    
				System.out.printf("%d %d %d%n",i,i*i,i*i*i);
			}

			sc.close();
		}

	}

