package principal;

import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um valor : ");
		double num = sc.nextDouble();
		if (num>0 & num<=25) {
			    System.out.println("Intervalo entre 0 e 25");
		}
			else if(num>25 & num <=50 ) {
			    System.out.println("Inervalo entre 25 e 50 ");				
		}
			else if (num>50 & num <=75) {
				System.out.println("Inervalo entre 50 e 75 ");	
				
			}
			else if (num>75 & num <=100) {
				System.out.println("Inervalo entre 75 e 100 ");	
				
			}
			else {
				System.out.println("numero fora do Intervalo");
			}
				
		
		
		
		sc.close();
	}
    
}
