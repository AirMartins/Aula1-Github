package principal;

import java.util.Scanner;

public class exr05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o Nome Produto : ");
		String a= sc.nextLine(); 
		System.out.println("Digite o C�digo do Produto "+a+": ");
		int codA = sc.nextInt();
		System.out.println("Digite a Quantidade do Produto "+a+": ");
		 int quant=sc.nextInt();
		
		if (codA<1 || codA>5) {
			System.out.println("C�digo do produto Inv�lido");
					
		}
		
		else if(codA==1) {
			double total=quant*4.0;
			System.out.printf("Codigo Produto       Quantidade   Valor%n %d    %s           %d        %.2f%n",codA,a,quant,total);
		}
		else if(codA==2) {
			double total=quant*4.5;
			System.out.printf("Codigo Produto       Quantidade   Valor%n %d    %s           %d        %.2f%n",codA,a,quant,total);
		}
		else if(codA==3) {
			double total=quant*5.0;
			System.out.printf("Codigo Produto       Quantidade   Valor%n %d    %s           %d        %.2f%n",codA,a,quant,total);
		}
		else if(codA==4) {
			double total=quant*2.0;
			System.out.printf("Codigo Produto       Quantidade   Valor%n %d    %s           %d        %.2f%n",codA,a,quant,total);
		}
		else if(codA==5) {
			double total=quant*1.5;
			System.out.printf("Codigo Produto       Quantidade   Valor%n %d    %s           %d        %.2f%n",codA,a,quant,total);
		}
		
		
		sc.close();
	}
    
}
