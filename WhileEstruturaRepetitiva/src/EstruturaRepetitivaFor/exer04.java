package EstruturaRepetitivaFor;

import java.util.Locale;
import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o valor de repetição: ");
		int n=sc.nextInt();
		    
		
		   	for(int i=0; i<n; i++) {
			System.out.println("digite o Valor da  prova A");
			double a=sc.nextDouble();
			System.out.println("digite o Valor da prova B");
			double b=sc.nextDouble();
			System.out.println("digite o Valor da prova C");
			double c=sc.nextDouble();
			double media= (a*2.0+b*3.0+c*5.0)/10.0;
			System.out.printf("média é: %.1f%n",media);
			
		   		
		}
		
		
    sc.close();
	}
}



